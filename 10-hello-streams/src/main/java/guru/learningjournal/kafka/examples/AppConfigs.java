package guru.learningjournal.kafka.examples;

public class AppConfigs {
    public static final String applicationID = "HelloStreams";
    public static final String producerApplicationID = "HelloProducer";
    public static final String bootstrapServers = "localhost:9092,localhost:9093";
    public static final String topicName = "hello-producer-topic";
    public static final int numEvents = 10;
}