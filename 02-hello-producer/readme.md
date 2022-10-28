# Hello Producer
---

# Create Topic

```sh
$KAFKA_HOME/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --topic hello-producer-topic --partitions 5 --replication-factor 3
```

---
HelloProducer.java

```java
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class HelloProducer {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info(">> Creating Kafka Producer...");
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // A Kafka client that publishes records to the Kafka cluster.
        // The producer is thread safe and sharing a single producer instance across threads will generally be faster
        // than having multiple instances.
        KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);

        logger.info("## Start sending messages...");
        for (int i = 0; i < AppConfigs.numEvents; i++) {
            
            // Asynchronously send a record to a topic. Equivalent to send(record, null).
            producer.send(new ProducerRecord<>(AppConfigs.topicName, i, "Simple Message-" + i));
        }
        logger.info("## Finished - Closing Kafka Producer.");
        producer.close();
    }
}
```

<img width="1197" alt="Screenshot 2022-10-28 at 6 21 13 PM" src="https://user-images.githubusercontent.com/54174687/198591464-e73df647-19b2-45cc-9fc0-440fe20dbbab.png">

<img width="1356" alt="Screenshot 2022-10-26 at 8 45 31 PM" src="https://user-images.githubusercontent.com/54174687/198067501-d79ff392-2da1-4914-af28-ff873afba565.png">


