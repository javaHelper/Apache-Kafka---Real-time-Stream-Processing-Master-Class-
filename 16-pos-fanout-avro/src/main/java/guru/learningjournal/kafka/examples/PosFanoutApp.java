package guru.learningjournal.kafka.examples;

import guru.learningjournal.kafka.examples.types.PosInvoice;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class PosFanoutApp {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, AppConfigs.applicationID);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);

        StreamsBuilder builder = new StreamsBuilder();
        KStream<String, PosInvoice> KS0 = builder.stream(AppConfigs.posTopicName,
            Consumed.with(AppSerdes.String(), AppSerdes.PosInvoice()));

        KS0.filter((k, v) -> AppConfigs.DELIVERY_TYPE_HOME_DELIVERY.equalsIgnoreCase(v.getDeliveryType().toString()))
            .to(AppConfigs.shipmentTopicName, Produced.with(AppSerdes.String(), AppSerdes.PosInvoice()));

        KS0.filter((k, v) -> AppConfigs.CUSTOMER_TYPE_PRIME.equalsIgnoreCase(v.getCustomerType().toString()))
            .mapValues(RecordBuilder::getNotification)
            .to(AppConfigs.notificationTopic, Produced.with(AppSerdes.String(), AppSerdes.Notification()));

        KS0.mapValues(RecordBuilder::getMaskedInvoice)
            .flatMapValues(RecordBuilder::getHadoopRecords)
            .to(AppConfigs.hadoopTopic, Produced.with(AppSerdes.String(), AppSerdes.HadoopRecord()));

        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Stopping Stream");
            streams.close();
        }));
    }
}