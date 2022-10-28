# Transactional producer

---
- Logs

```logs
[2022-10-28 20:21:42,941] (guru.learningjournal.kafka.examples.HelloProducer) - INFO Creating Kafka Producer... 
[2022-10-28 20:21:45,648] (guru.learningjournal.kafka.examples.HelloProducer) - INFO ## Starting First Transaction... 
[2022-10-28 20:21:45,716] (guru.learningjournal.kafka.examples.HelloProducer) - INFO Committing First Transaction. 
[2022-10-28 20:21:45,960] (guru.learningjournal.kafka.examples.HelloProducer) - INFO ------- Starting Second Transaction for Abort ... ---- 
[2022-10-28 20:21:45,962] (guru.learningjournal.kafka.examples.HelloProducer) - INFO Aborting Second Transaction. 
[2022-10-28 20:21:46,096] (guru.learningjournal.kafka.examples.HelloProducer) - INFO Finished - Closing Kafka Producer. 
```

HelloProducer.java

```java
package guru.learningjournal.kafka.examples;

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
        logger.info("Creating Kafka Producer...");
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, AppConfigs.transaction_id);

        KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);
        producer.initTransactions();

        logger.info("## Starting First Transaction...");
        producer.beginTransaction();

        try {
            for (int i = 1; i < AppConfigs.numEvents; i++) {
                producer.send(new ProducerRecord<>(AppConfigs.topicName1, i, "Simple Message-T1-" + i));
                producer.send(new ProducerRecord<>(AppConfigs.topicName2, i, "Simple Message-T1-" + i));
            }
            logger.info("Committing First Transaction.");
            producer.commitTransaction();
        } catch (Exception e) {
            logger.error("Exception in First Transaction. Aborting...");
            producer.abortTransaction();
            producer.close();
            throw new RuntimeException(e);
        }

        logger.info("------- Starting Second Transaction for Abort ... ----");
        producer.beginTransaction();
        try {
            for (int i = 1; i <= AppConfigs.numEvents; i++) {
                producer.send(new ProducerRecord<>(AppConfigs.topicName1, i, "Simple Message-T2-" + i));
                producer.send(new ProducerRecord<>(AppConfigs.topicName2, i, "Simple Message-T2-" + i));
            }
            logger.info("Aborting Second Transaction.");
            producer.abortTransaction();
        } catch (Exception e) {
            logger.error("Exception in Second Transaction. Aborting...");
            producer.abortTransaction();
            producer.close();
            throw new RuntimeException(e);
        }

        logger.info("Finished - Closing Kafka Producer.");
        producer.close();
    }
}
```

---
<img width="1362" alt="Screenshot 2022-10-26 at 10 09 21 PM" src="https://user-images.githubusercontent.com/54174687/198085293-05001920-f9d8-41d7-8c82-0b5f949c5bf6.png">
