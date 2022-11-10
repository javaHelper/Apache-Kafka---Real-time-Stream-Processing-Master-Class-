# kstream-gktable-join

Console Producer 1

````
% /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/31-kstream-gktable-join/scripts/start-producer-1.sh
>1001:{"InventoryID": "1001", "NewsType": "Sports"}
>1002:{"InventoryID": "1002", "NewsType": "Politics"}
>1003:{"InventoryID": "1003", "NewsType": "LocalNews"}
>1004:{"InventoryID": "1004", "NewsType": "WorldNews"}
>1005:{"InventoryID": "1005", "NewsType": "Health"}
>1006:{"InventoryID": "1006", "NewsType": "Lifestyle"}
>1007:{"InventoryID": "1007", "NewsType": "Literature"}
>1008:{"InventoryID": "1008", "NewsType": "Education"}
>1009:{"InventoryID": "1009", "NewsType": "Social"}
>1010:{"InventoryID": "1010", "NewsType": "Business"}
>
````

Console Producer 2

````
% /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/31-kstream-gktable-join/scripts/start-producer-2.sh
>1001:{"InventoryID": "1001"}
>1002:{"InventoryID": "1002"}
>1003:{"InventoryID": "1003"}
>1001:{"InventoryID": "1001"}
>1003:{"InventoryID": "1003"}
>1005:{"InventoryID": "1005"}
>1002:{"InventoryID": "1002"}
>1001:{"InventoryID": "1001"}
>1003:{"InventoryID": "1003"}
>1003:{"InventoryID": "1003"}
>
````


- App logs

````shell
[2022-11-10 18:29:39,769] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO Starting Stream... 
[2022-11-10 18:29:41,966] (org.apache.kafka.clients.NetworkClient) - WARN [Consumer clientId=GKTableJoinDemo-80e9ca3b-37e7-4e66-8095-6e6e00d9ab81-StreamThread-1-consumer, groupId=GKTableJoinDemo] Error while fetching metadata with correlation id 2 : {GKTableJoinDemo-KSTREAM-AGGREGATE-STATE-STORE-0000000006-repartition=UNKNOWN_TOPIC_OR_PARTITION} 
[2022-11-10 18:29:42,079] (org.apache.kafka.clients.NetworkClient) - WARN [Consumer clientId=GKTableJoinDemo-80e9ca3b-37e7-4e66-8095-6e6e00d9ab81-StreamThread-1-consumer, groupId=GKTableJoinDemo] Error while fetching metadata with correlation id 7 : {GKTableJoinDemo-KSTREAM-AGGREGATE-STATE-STORE-0000000006-repartition=UNKNOWN_TOPIC_OR_PARTITION} 
[KTABLE-TOSTREAM-0000000011]: Politics, 1
[KTABLE-TOSTREAM-0000000011]: LocalNews, 1
[KTABLE-TOSTREAM-0000000011]: Politics, 2
[KTABLE-TOSTREAM-0000000011]: LocalNews, 3
[KTABLE-TOSTREAM-0000000011]: LocalNews, 4
[KTABLE-TOSTREAM-0000000011]: Sports, 1
[KTABLE-TOSTREAM-0000000011]: Sports, 2
[KTABLE-TOSTREAM-0000000011]: Health, 1
[KTABLE-TOSTREAM-0000000011]: Sports, 3
````