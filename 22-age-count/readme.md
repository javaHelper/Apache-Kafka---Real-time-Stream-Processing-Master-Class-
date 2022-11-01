# Age Count 

Note: Use confluent Kafka directly, do not use multi node cluster setup!

----

```sh
@Prateeks-MacBook-Pro ~ % kafka-console-producer.sh --broker-list localhost:9092 --topic person-age  --property parse.key=true --property key.separator=":"
>Abdul:26
>Milli:26
>Prashant:41
>John:38
>Abdul:27
>
```

Console 

```logs
[2022-11-01 16:11:56,436] (org.apache.kafka.clients.NetworkClient) - WARN [Consumer clientId=AgeCountDemo-1c86ab9b-4217-4cef-a4cf-d6dfc6f24893-StreamThread-1-consumer, groupId=AgeCountDemo] Error while fetching metadata with correlation id 2 : {AgeCountDemo-KTABLE-AGGREGATE-STATE-STORE-0000000004-repartition=UNKNOWN_TOPIC_OR_PARTITION} 
[2022-11-01 16:11:56,542] (org.apache.kafka.clients.NetworkClient) - WARN [Consumer clientId=AgeCountDemo-1c86ab9b-4217-4cef-a4cf-d6dfc6f24893-StreamThread-1-consumer, groupId=AgeCountDemo] Error while fetching metadata with correlation id 7 : {AgeCountDemo-KTABLE-AGGREGATE-STATE-STORE-0000000004-repartition=UNKNOWN_TOPIC_OR_PARTITION} 
[Age Count]: 26, 1
[Age Count]: 26, 2
[Age Count]: 41, 1
[Age Count]: 38, 1
[Age Count]: 26, 1
[Age Count]: 27, 1

```
