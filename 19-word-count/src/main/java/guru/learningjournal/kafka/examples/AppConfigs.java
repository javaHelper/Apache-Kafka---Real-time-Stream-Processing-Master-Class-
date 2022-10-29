package guru.learningjournal.kafka.examples;

class AppConfigs {
    final static String applicationID = "WordCount";
    final static String bootstrapServers = "localhost:9092";
    final static String topicName = "word-count";
    final static String stateStoreLocation = "tmp/state-store";
}