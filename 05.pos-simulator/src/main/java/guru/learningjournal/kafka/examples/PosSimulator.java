package guru.learningjournal.kafka.examples;

import guru.learningjournal.kafka.examples.serde.JsonSerializer;
import guru.learningjournal.kafka.examples.types.PosInvoice;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PosSimulator {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide command line arguments: topicName noOfProducers produceSpeed");
            System.exit(-1);
        }
        String topicName = args[0];
        int noOfProducers = Integer.parseInt(args[1]);
        int produceSpeed = Integer.parseInt(args[2]);

        Properties properties = new Properties();
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        KafkaProducer<String, PosInvoice> kafkaProducer = new KafkaProducer<>(properties);
        ExecutorService executor = Executors.newFixedThreadPool(noOfProducers);
        final List<RunnableProducer> runnableProducers = new ArrayList<>();

        for (int i = 0; i < noOfProducers; i++) {
            RunnableProducer runnableProducer = new RunnableProducer(i, kafkaProducer, topicName, produceSpeed);
            runnableProducers.add(runnableProducer);
            executor.submit(runnableProducer);
        }

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            for (RunnableProducer p : runnableProducers) p.shutdown();
            executor.shutdown();
            logger.info("Closing Executor Service");
            try {
                boolean result = executor.awaitTermination(produceSpeed * 2L, TimeUnit.MILLISECONDS);
                System.out.println(result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));
    }
}