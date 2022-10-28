# Multithreading
---

Logs - 

```logs
/Library/Java/JavaVirtualMachines/jdk-11.0.13.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50311:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/03-multi-threading/target/classes:/Users/prats/.m2/repository/org/apache/kafka/kafka-clients/3.3.1/kafka-clients-3.3.1.jar:/Users/prats/.m2/repository/com/github/luben/zstd-jni/1.5.2-1/zstd-jni-1.5.2-1.jar:/Users/prats/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar:/Users/prats/.m2/repository/org/xerial/snappy/snappy-java/1.1.8.4/snappy-java-1.1.8.4.jar:/Users/prats/.m2/repository/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:/Users/prats/.m2/repository/org/apache/logging/log4j/log4j-slf4j-impl/2.19.0/log4j-slf4j-impl-2.19.0.jar:/Users/prats/.m2/repository/org/apache/logging/log4j/log4j-api/2.19.0/log4j-api-2.19.0.jar:/Users/prats/.m2/repository/org/apache/logging/log4j/log4j-core/2.19.0/log4j-core-2.19.0.jar guru.learningjournal.kafka.examples.DispatcherDemo
[2022-10-28 19:58:03,644] (guru.learningjournal.kafka.examples.DispatcherDemo) INFO - === Starting Dispatcher threads... 
[2022-10-28 19:58:03,652] (guru.learningjournal.kafka.examples.Dispatcher) INFO - ## Start Processing data/NSE05NOV2018BHAV.csv 
[2022-10-28 19:58:03,652] (guru.learningjournal.kafka.examples.Dispatcher) INFO - ## Start Processing data/NSE06NOV2018BHAV.csv 
[2022-10-28 19:58:04,692] (guru.learningjournal.kafka.examples.Dispatcher) INFO - ### Finished Sending 1881 messages from data/NSE06NOV2018BHAV.csv 
[2022-10-28 19:58:04,691] (guru.learningjournal.kafka.examples.Dispatcher) INFO - ### Finished Sending 1907 messages from data/NSE05NOV2018BHAV.csv 
[2022-10-28 19:58:05,018] (guru.learningjournal.kafka.examples.DispatcherDemo) INFO - ==> Finished Dispatcher Demo 
```


Dispatcher.java

```java
package guru.learningjournal.kafka.examples;

import org.apache.kafka.clients.producer.KafkaProducer;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dispatcher implements Runnable {
    private static final Logger logger = LogManager.getLogger();
    private String fileLocation;
    private String topicName;
    private KafkaProducer<Integer, String> producer;

    public Dispatcher(KafkaProducer<Integer, String> producer, String topicName, String fileLocation) {
        this.producer = producer;
        this.topicName = topicName;
        this.fileLocation = fileLocation;
    }

    @Override
    public void run() {
        logger.info("## Start Processing " + fileLocation);
        File file = new File(fileLocation);
        int counter = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                producer.send(new ProducerRecord<>(topicName, null, line));
                counter++;
            }
            logger.info("### Finished Sending " + counter + " messages from " + fileLocation);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
```

DispatcherDemo.java

```java
package guru.learningjournal.kafka.examples;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DispatcherDemo {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        Properties props = new Properties();
        try {
            InputStream inputStream = new FileInputStream(AppConfigs.kafkaConfigFileLocation);
            props.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);
        Thread[] dispatchers = new Thread[AppConfigs.eventFiles.length];

        logger.info("=== Starting Dispatcher threads...");
        for (int i = 0; i < AppConfigs.eventFiles.length; i++) {
            dispatchers[i] = new Thread(new Dispatcher(producer, AppConfigs.topicName, AppConfigs.eventFiles[i]));
            dispatchers[i].start();
        }

        try {
            for (Thread t : dispatchers) t.join();
        } catch (InterruptedException e) {
            logger.error("==> Main Thread Interrupted");
        } finally {
            producer.close();
            logger.info("==> Finished Dispatcher Demo");
        }
    }
}
```
------

<img width="1326" alt="Screenshot 2022-10-28 at 8 06 26 PM" src="https://user-images.githubusercontent.com/54174687/198650113-2b485eeb-f0cb-4015-803e-8ec740e2e2ac.png">


------

<img width="1363" alt="Screenshot 2022-10-26 at 9 37 53 PM" src="https://user-images.githubusercontent.com/54174687/198078727-bf2a482e-559a-434e-85c8-b58d55f561c1.png">
