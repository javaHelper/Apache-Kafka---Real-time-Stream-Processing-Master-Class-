package guru.learningjournal.kafka.examples;

import guru.learningjournal.kafka.examples.serde.AppSerdes;
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

        StreamsBuilder streamsBuilder = new StreamsBuilder();

        // Read pos topic
        KStream<String, PosInvoice> KS0 = streamsBuilder.stream(AppConfigs.posTopicName,
                Consumed.with(AppSerdes.String(), AppSerdes.PosInvoice()));

        // Filter invoices where Delivery type = HOME-DELIVERY and send to Shipment topic
        KS0.filter((k, v) -> AppConfigs.DELIVERY_TYPE_HOME_DELIVERY.equalsIgnoreCase(v.getDeliveryType()))
                .to(AppConfigs.shipmentTopicName, Produced.with(AppSerdes.String(), AppSerdes.PosInvoice()));

        // Filter invoices where Customer Type = PRIME, get Notification object and send to Notification topic
        KS0.filter((k, v) -> AppConfigs.CUSTOMER_TYPE_PRIME.equalsIgnoreCase(v.getCustomerType()))
                .mapValues(RecordBuilder::getNotification)
                .to(AppConfigs.notificationTopic, Produced.with(AppSerdes.String(), AppSerdes.Notification()));

        // Get Masked Invoice , get HadoopRecords for analytics and send to Hadoop topic
        KS0.mapValues(RecordBuilder::getMaskedInvoice)
                .flatMapValues(RecordBuilder::getHadoopRecords)
                .to(AppConfigs.hadoopTopic, Produced.with(AppSerdes.String(), AppSerdes.HadoopRecord()));

        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Stopping Stream");
            streams.close();
        }));
    }
}