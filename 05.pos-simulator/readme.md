# pos simulator
---

- Logs

```logs

/Library/Java/JavaVirtualMachines/jdk-11.0.13.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=58724:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/05.pos-simulator/target/classes:/Users/prats/.m2/repository/org/apache/kafka/kafka-clients/3.3.1/kafka-clients-3.3.1.jar:/Users/prats/.m2/repository/com/github/luben/zstd-jni/1.5.2-1/zstd-jni-1.5.2-1.jar:/Users/prats/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar:/Users/prats/.m2/repository/org/xerial/snappy/snappy-java/1.1.8.4/snappy-java-1.1.8.4.jar:/Users/prats/.m2/repository/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:/Users/prats/.m2/repository/org/apache/logging/log4j/log4j-slf4j-impl/2.19.0/log4j-slf4j-impl-2.19.0.jar:/Users/prats/.m2/repository/org/apache/logging/log4j/log4j-api/2.19.0/log4j-api-2.19.0.jar:/Users/prats/.m2/repository/org/apache/logging/log4j/log4j-core/2.19.0/log4j-core-2.19.0.jar:/Users/prats/.m2/repository/commons-lang/commons-lang/2.6/commons-lang-2.6.jar:/Users/prats/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.13.4/jackson-databind-2.13.4.jar:/Users/prats/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.13.4/jackson-annotations-2.13.4.jar:/Users/prats/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.13.4/jackson-core-2.13.4.jar guru.learningjournal.kafka.examples.PosSimulator pos 1 1000
[2022-10-28 21:36:16,217] (guru.learningjournal.kafka.examples.RunnableProducer) - INFO Starting producer thread - 0 
[2022-10-28 21:36:16,252] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@7e2c1181[invoiceNumber=18805368,createdTime=1666973176221,storeID=STR1534,posID=POS934,cashierID=OAS544,customerType=PRIME,customerCardNo=5525406429,totalAmount=3266.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=3266.0,cGST=81.65,sGST=81.65,cESS=4.0825000000000005,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@ba9fc9b[itemCode=558,itemDescription=Balloon clock,itemPrice=1633.0,itemQty=2,totalValue=3266.0]]] 
[2022-10-28 21:36:17,577] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@18440c2c[invoiceNumber=44050921,createdTime=1666973177553,storeID=STR5646,posID=POS639,cashierID=OAS167,customerType=PRIME,customerCardNo=9711257112,totalAmount=7706.0,numberOfItems=4,paymentMethod=CARD,taxableAmount=7706.0,cGST=192.65,sGST=192.65,cESS=9.6325,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@288d2438[addressLine=627-5294 Nisi St.,city=Hyderabad,state=Andhra Pradesh,pinCode=827202,contactNumber=7553553297],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@75c89f9f[itemCode=273,itemDescription=Bedroom set,itemPrice=842.0,itemQty=2,totalValue=1684.0], guru.learningjournal.kafka.examples.types.LineItem@37459904[itemCode=253,itemDescription=Bathroom cabinet,itemPrice=1513.0,itemQty=1,totalValue=1513.0], guru.learningjournal.kafka.examples.types.LineItem@f58c6ac[itemCode=478,itemDescription=Teapot,itemPrice=885.0,itemQty=1,totalValue=885.0], guru.learningjournal.kafka.examples.types.LineItem@4e359f9b[itemCode=288,itemDescription=Hutch,itemPrice=1812.0,itemQty=2,totalValue=3624.0]]] 
[2022-10-28 21:36:18,588] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@2d822970[invoiceNumber=40965157,createdTime=1666973178586,storeID=STR8513,posID=POS582,cashierID=OAS212,customerType=PRIME,customerCardNo=6705218300,totalAmount=2862.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=2862.0,cGST=71.55,sGST=71.55,cESS=3.5775,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@4fa9a21c[itemCode=418,itemDescription=Wing chair,itemPrice=1431.0,itemQty=2,totalValue=2862.0]]] 
[2022-10-28 21:36:19,602] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@65cf9218[invoiceNumber=87860072,createdTime=1666973179598,storeID=STR2699,posID=POS773,cashierID=OAS568,customerType=NONPRIME,customerCardNo=9327106277,totalAmount=2626.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=2626.0,cGST=65.65,sGST=65.65,cESS=3.2825,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@593aee78[itemCode=373,itemDescription=Latex Mattress,itemPrice=1313.0,itemQty=2,totalValue=2626.0]]] 
[2022-10-28 21:36:20,611] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@3c9d603[invoiceNumber=16996327,createdTime=1666973180609,storeID=STR7449,posID=POS923,cashierID=OAS748,customerType=NONPRIME,customerCardNo=1422009832,totalAmount=1686.0,numberOfItems=1,paymentMethod=CARD,taxableAmount=1686.0,cGST=42.150000000000006,sGST=42.150000000000006,cESS=2.1075,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@1a0fcb30[addressLine=Flat No. #740-6953 Scelerisque Rd.,city=Mango,state=Jharkhand,pinCode=697196,contactNumber=7172289826],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@1448af27[itemCode=203,itemDescription=Bunk bed,itemPrice=1686.0,itemQty=1,totalValue=1686.0]]] 
[2022-10-28 21:36:21,621] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@ade6589[invoiceNumber=52807620,createdTime=1666973181619,storeID=STR2952,posID=POS477,cashierID=OAS259,customerType=NONPRIME,customerCardNo=3425633108,totalAmount=12881.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=12881.0,cGST=322.02500000000003,sGST=322.02500000000003,cESS=16.10125,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@6eec69a9[itemCode=593,itemDescription=Hanging curtains,itemPrice=1896.0,itemQty=2,totalValue=3792.0], guru.learningjournal.kafka.examples.types.LineItem@3f8cd2c4[itemCode=623,itemDescription= Box Pleat Drapes,itemPrice=1683.0,itemQty=2,totalValue=3366.0], guru.learningjournal.kafka.examples.types.LineItem@2e22e80e[itemCode=643,itemDescription=Blow torch,itemPrice=1955.0,itemQty=1,totalValue=1955.0], guru.learningjournal.kafka.examples.types.LineItem@57a9226e[itemCode=388,itemDescription=Memory Foam,itemPrice=1884.0,itemQty=2,totalValue=3768.0]]] 
[2022-10-28 21:36:22,630] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@18440c2c[invoiceNumber=20410081,createdTime=1666973182629,storeID=STR5646,posID=POS639,cashierID=OAS167,customerType=PRIME,customerCardNo=9711257112,totalAmount=1431.0,numberOfItems=1,paymentMethod=CARD,taxableAmount=1431.0,cGST=35.775,sGST=35.775,cESS=1.78875,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@3465b75[addressLine=529-4520 Libero. Ave,city=Raigarh,state=Chhattisgarh,pinCode=183678,contactNumber=3057906681],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@4fa9a21c[itemCode=418,itemDescription=Wing chair,itemPrice=1431.0,itemQty=1,totalValue=1431.0]]] 
[2022-10-28 21:36:23,636] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@24b95ee4[invoiceNumber=46338326,createdTime=1666973183635,storeID=STR6347,posID=POS622,cashierID=OAS793,customerType=PRIME,customerCardNo=5697125813,totalAmount=5832.0,numberOfItems=3,paymentMethod=CARD,taxableAmount=5832.0,cGST=145.8,sGST=145.8,cESS=7.29,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@538b2f40[addressLine=3122 Morbi Ave,city=Palakkad,state=Kerala,pinCode=800459,contactNumber=8235927974],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@6eec69a9[itemCode=593,itemDescription=Hanging curtains,itemPrice=1896.0,itemQty=1,totalValue=1896.0], guru.learningjournal.kafka.examples.types.LineItem@62a75bb7[itemCode=683,itemDescription=Grater,itemPrice=370.0,itemQty=2,totalValue=740.0], guru.learningjournal.kafka.examples.types.LineItem@3561af81[itemCode=518,itemDescription=Hourglass,itemPrice=1598.0,itemQty=2,totalValue=3196.0]]] 
[2022-10-28 21:36:24,641] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@43d75831[invoiceNumber=10745948,createdTime=1666973184639,storeID=STR2629,posID=POS647,cashierID=OAS515,customerType=PRIME,customerCardNo=1053863739,totalAmount=4389.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=4389.0,cGST=109.72500000000001,sGST=109.72500000000001,cESS=5.48625,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@392f6146[itemCode=328,itemDescription=Dining chair,itemPrice=1223.0,itemQty=2,totalValue=2446.0], guru.learningjournal.kafka.examples.types.LineItem@e107d72[itemCode=358,itemDescription=Restraint chair,itemPrice=1943.0,itemQty=1,totalValue=1943.0]]] 
[2022-10-28 21:36:25,651] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@18eb21d4[invoiceNumber=28388597,createdTime=1666973185649,storeID=STR7188,posID=POS664,cashierID=OAS971,customerType=PRIME,customerCardNo=9316477281,totalAmount=7509.0,numberOfItems=4,paymentMethod=CARD,taxableAmount=7509.0,cGST=187.72500000000002,sGST=187.72500000000002,cESS=9.38625,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@5a0c46de[addressLine=Flat No. #229-5133 Quam. Road,city=Haridwar,state=Uttarakhand,pinCode=478334,contactNumber=8593433887],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@577a5b00[itemCode=263,itemDescription=Kitchen cabinet,itemPrice=1050.0,itemQty=1,totalValue=1050.0], guru.learningjournal.kafka.examples.types.LineItem@11605eb9[itemCode=233,itemDescription=Coffee table,itemPrice=1055.0,itemQty=1,totalValue=1055.0], guru.learningjournal.kafka.examples.types.LineItem@504428c0[itemCode=613,itemDescription=Goblet Pleat Drapes,itemPrice=1583.0,itemQty=2,totalValue=3166.0], guru.learningjournal.kafka.examples.types.LineItem@6846aea0[itemCode=318,itemDescription=Bofinger chair,itemPrice=1119.0,itemQty=2,totalValue=2238.0]]] 
[2022-10-28 21:36:26,663] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@7ee75460[invoiceNumber=11228612,createdTime=1666973186660,storeID=STR8311,posID=POS935,cashierID=OAS755,customerType=NONPRIME,customerCardNo=5196911608,totalAmount=4653.0,numberOfItems=2,paymentMethod=CARD,taxableAmount=4653.0,cGST=116.325,sGST=116.325,cESS=5.81625,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@f946154[itemCode=278,itemDescription=Dining set,itemPrice=1940.0,itemQty=2,totalValue=3880.0], guru.learningjournal.kafka.examples.types.LineItem@52faeda8[itemCode=398,itemDescription=Latex Mattress,itemPrice=773.0,itemQty=1,totalValue=773.0]]] 
[2022-10-28 21:36:27,675] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@ade6589[invoiceNumber=30282293,createdTime=1666973187669,storeID=STR2952,posID=POS477,cashierID=OAS259,customerType=NONPRIME,customerCardNo=3425633108,totalAmount=4415.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=4415.0,cGST=110.375,sGST=110.375,cESS=5.51875,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@712b0547[itemCode=223,itemDescription=Hammock,itemPrice=1210.0,itemQty=1,totalValue=1210.0], guru.learningjournal.kafka.examples.types.LineItem@5d9954f7[itemCode=293,itemDescription=Bar stool,itemPrice=1148.0,itemQty=1,totalValue=1148.0], guru.learningjournal.kafka.examples.types.LineItem@580b6541[itemCode=573,itemDescription=Eyelet Curtains,itemPrice=642.0,itemQty=2,totalValue=1284.0], guru.learningjournal.kafka.examples.types.LineItem@52faeda8[itemCode=398,itemDescription=Latex Mattress,itemPrice=773.0,itemQty=1,totalValue=773.0]]] 
[2022-10-28 21:36:28,684] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@7ee75460[invoiceNumber=93350570,createdTime=1666973188679,storeID=STR8311,posID=POS935,cashierID=OAS755,customerType=NONPRIME,customerCardNo=5196911608,totalAmount=6745.0,numberOfItems=3,paymentMethod=CARD,taxableAmount=6745.0,cGST=168.625,sGST=168.625,cESS=8.43125,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@593aee78[itemCode=373,itemDescription=Latex Mattress,itemPrice=1313.0,itemQty=1,totalValue=1313.0], guru.learningjournal.kafka.examples.types.LineItem@1c7bc265[itemCode=268,itemDescription=Floating shelf,itemPrice=1894.0,itemQty=2,totalValue=3788.0], guru.learningjournal.kafka.examples.types.LineItem@bd203f1[itemCode=458,itemDescription=Wine glass,itemPrice=1644.0,itemQty=1,totalValue=1644.0]]] 
[2022-10-28 21:36:29,698] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@22cc194c[invoiceNumber=49626195,createdTime=1666973189691,storeID=STR6347,posID=POS333,cashierID=OAS697,customerType=NONPRIME,customerCardNo=9740604930,totalAmount=1467.0,numberOfItems=1,paymentMethod=CARD,taxableAmount=1467.0,cGST=36.675000000000004,sGST=36.675000000000004,cESS=1.83375,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@60e69f9a[addressLine=6363 Non Rd.,city=Darbhanga,state=Bihar,pinCode=570288,contactNumber=5656699770],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@7bb0d5fc[itemCode=468,itemDescription=Lunch box,itemPrice=1467.0,itemQty=1,totalValue=1467.0]]] 
[2022-10-28 21:36:30,709] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@33fb4859[invoiceNumber=85463081,createdTime=1666973190706,storeID=STR1955,posID=POS324,cashierID=OAS183,customerType=NONPRIME,customerCardNo=3916555911,totalAmount=7456.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=7456.0,cGST=186.4,sGST=186.4,cESS=9.32,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@67b51bf3[addressLine=House No 727, 9696 Ullamcorper, Road,city=Dabgram,state=West Bengal,pinCode=953658,contactNumber=4166559042],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@1ad73dcc[itemCode=423,itemDescription=Quilt,itemPrice=1485.0,itemQty=1,totalValue=1485.0], guru.learningjournal.kafka.examples.types.LineItem@f58c6ac[itemCode=478,itemDescription=Teapot,itemPrice=885.0,itemQty=2,totalValue=1770.0], guru.learningjournal.kafka.examples.types.LineItem@122aaa2c[itemCode=323,itemDescription=Chiavari chair,itemPrice=653.0,itemQty=1,totalValue=653.0], guru.learningjournal.kafka.examples.types.LineItem@7b7a81b0[itemCode=628,itemDescription=Window Scarf,itemPrice=1774.0,itemQty=2,totalValue=3548.0]]] 
[2022-10-28 21:36:31,715] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@174515a5[invoiceNumber=36249153,createdTime=1666973191715,storeID=STR2952,posID=POS152,cashierID=OAS329,customerType=PRIME,customerCardNo=3027514652,totalAmount=1313.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=1313.0,cGST=32.825,sGST=32.825,cESS=1.64125,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@593aee78[itemCode=373,itemDescription=Latex Mattress,itemPrice=1313.0,itemQty=1,totalValue=1313.0]]] 
[2022-10-28 21:36:32,728] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@93fd6b8[invoiceNumber=44116449,createdTime=1666973192727,storeID=STR8311,posID=POS975,cashierID=OAS881,customerType=NONPRIME,customerCardNo=4680751410,totalAmount=7825.0,numberOfItems=3,paymentMethod=CARD,taxableAmount=7825.0,cGST=195.625,sGST=195.625,cESS=9.78125,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@684883fd[itemCode=438,itemDescription=Lead glass,itemPrice=2069.0,itemQty=1,totalValue=2069.0], guru.learningjournal.kafka.examples.types.LineItem@40dc83ce[itemCode=308,itemDescription=Butterfly chair,itemPrice=857.0,itemQty=2,totalValue=1714.0], guru.learningjournal.kafka.examples.types.LineItem@2dc46979[itemCode=363,itemDescription=Rocking chair,itemPrice=2021.0,itemQty=2,totalValue=4042.0]]] 
[2022-10-28 21:36:33,143] (guru.learningjournal.kafka.examples.RunnableProducer) - INFO Shutting down producer thread - 0 
[2022-10-28 21:36:33,145] (guru.learningjournal.kafka.examples.PosSimulator) - INFO Closing Executor Service 
```


PosSimulator

```java
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
```

RunnableProducer.java

```java
import guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator;
import guru.learningjournal.kafka.examples.types.PosInvoice;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicBoolean;

public class RunnableProducer implements Runnable {
    private static final Logger logger = LogManager.getLogger();

    private final AtomicBoolean stopper = new AtomicBoolean(false);

    private final KafkaProducer<String, PosInvoice> producer;
    private final String topicName;
    private final InvoiceGenerator invoiceGenerator;
    private final int produceSpeed;
    private final int id;

    public RunnableProducer(int id, KafkaProducer<String, PosInvoice> producer, String topicName, int produceSpeed) {
        this.id = id;
        this.producer = producer;
        this.topicName = topicName;
        this.produceSpeed = produceSpeed;
        this.invoiceGenerator = InvoiceGenerator.getInstance();
    }
    @Override
    public void run() {
        try {
            logger.info("Starting producer thread - " + id);
            while (!stopper.get()) {
                PosInvoice posInvoice = invoiceGenerator.getNextInvoice();
                producer.send(new ProducerRecord<>(topicName, posInvoice.getStoreID(), posInvoice));
                Thread.sleep(produceSpeed);
            }
        } catch (Exception e) {
            logger.error("Exception in Producer thread - " + id);
            throw new RuntimeException(e);
        }
    }

    void shutdown() {
        logger.info("Shutting down producer thread - " + id);
        stopper.set(true);
    }
}
```

<img width="1338" alt="Screenshot 2022-10-28 at 9 38 38 PM" src="https://user-images.githubusercontent.com/54174687/198683203-c6847fb6-0165-4363-bd71-b5ca41c99e1d.png">



<img width="651" alt="Screenshot 2022-10-28 at 9 29 47 PM" src="https://user-images.githubusercontent.com/54174687/198681721-6165dcff-8608-469c-9d9e-8897e413f837.png">



---

<img width="1363" alt="Screenshot 2022-10-26 at 10 22 48 PM" src="https://user-images.githubusercontent.com/54174687/198087967-af34c179-9983-44cc-af65-9b6460c618b9.png">
