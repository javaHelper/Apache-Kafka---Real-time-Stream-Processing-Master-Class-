# Sync Hello Producer

------

Follow below steps to generate exception.
1. Start three node cluster
2. Create topic with `--config min.insync.replicas=3`
3. Start producer application
4. Shutdown one broker while producer is running - It will cause NotEnoughReplicasException

-----
- Logs

```logs
[2022-10-28 21:53:58,574] (guru.learningjournal.kafka.examples.SyncHelloProducer) - TRACE === Creating Kafka Producer...=== 
[2022-10-28 21:53:59,957] (guru.learningjournal.kafka.examples.SyncHelloProducer) - INFO Message 1 persisted with offset 0 and timestamp on 2022-10-28 21:53:59.779 
[2022-10-28 21:54:00,982] (guru.learningjournal.kafka.examples.SyncHelloProducer) - INFO Message 2 persisted with offset 1 and timestamp on 2022-10-28 21:54:00.963 
[2022-10-28 21:54:02,008] (guru.learningjournal.kafka.examples.SyncHelloProducer) - INFO Message 3 persisted with offset 2 and timestamp on 2022-10-28 21:54:01.988 
[2022-10-28 21:54:03,031] (guru.learningjournal.kafka.examples.SyncHelloProducer) - INFO Message 4 persisted with offset 3 and timestamp on 2022-10-28 21:54:03.013 
[2022-10-28 21:54:04,119] (guru.learningjournal.kafka.examples.SyncHelloProducer) - INFO Can't send message - Received exception 
org.apache.kafka.common.errors.NotEnoughReplicasException: Messages are rejected since there are fewer in-sync replicas than required. 
```

-----

SyncHelloProducer.java

```java
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Timestamp;
import java.util.Properties;

public class SyncHelloProducer {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.trace("=== Creating Kafka Producer...===");
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        //We want to raise an exception - So, do not retry.
        props.put(ProducerConfig.RETRIES_CONFIG, 0);

        //We want to raise an exception - So, take acknowledgement only when message is persisted to all brokers in ISR
        props.put(ProducerConfig.ACKS_CONFIG, "all");

        /*
            Follow below steps to generate exception.
            1. Start three node cluster
            2. Create topic with `--config min.insync.replicas=3`
            3. Start producer application
            4. Shutdown one broker while producer is running - It will cause NotEnoughReplicasException
        */

        RecordMetadata metadata;
        try (KafkaProducer<Integer, String> producer = new KafkaProducer<>(props)) {
            for (int i = 1; i <= AppConfigs.numEvents; i++) {
                Thread.sleep(1000);
                metadata = producer.send(new ProducerRecord<>(AppConfigs.topicName, i, "Simple Message-" + i)).get();
                logger.info("Message " + i + " persisted with offset " + metadata.offset()
                        + " and timestamp on " + new Timestamp(metadata.timestamp()));
            }
        } catch (Exception e) {
            logger.info("Can't send message - Received exception \n" + e.getMessage());
        }
    }
```


