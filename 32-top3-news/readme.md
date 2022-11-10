# to3-news

Console producer -1
````
prateekashtikar@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/32-top3-news/scripts/start-producer-1.sh
>1001:{"InventoryID": "1001", "NewsType": "Sports"}
>1002:{"InventoryID": "1002", "NewsType": "Politics"}
>1003:{"InventoryID": "1003", "NewsType": "LocalNews"}
>1004:{"InventoryID": "1004", "NewsType": "WorldNews"}
>1005:{"InventoryID": "1005", "NewsType": "Health"}
>
````

Console producer -2

````
prateekashtikar@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/32-top3-news/scripts/start-producer-2.sh
>1001:{"InventoryID": "1001"}
>1002:{"InventoryID": "1002"}
>1003:{"InventoryID": "1003"}
>1004:{"InventoryID": "1004"}
>1004:{"InventoryID": "1004"}
>1002:{"InventoryID": "1002"}
>
````



- App Logs

````
[2022-11-10 19:57:15,446] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO Starting Stream... 
[2022-11-10 19:57:18,179] (org.apache.kafka.clients.NetworkClient) - WARN [Consumer clientId=GKTableJoinDemo-744f7e53-d3b1-43b7-bafe-08c70d0b6157-StreamThread-1-consumer, groupId=GKTableJoinDemo] Error while fetching metadata with correlation id 2 : {GKTableJoinDemo-KSTREAM-AGGREGATE-STATE-STORE-0000000006-repartition=UNKNOWN_TOPIC_OR_PARTITION, GKTableJoinDemo-top3-clicks-repartition=UNKNOWN_TOPIC_OR_PARTITION} 
[2022-11-10 19:57:18,298] (org.apache.kafka.clients.NetworkClient) - WARN [Consumer clientId=GKTableJoinDemo-744f7e53-d3b1-43b7-bafe-08c70d0b6157-StreamThread-1-consumer, groupId=GKTableJoinDemo] Error while fetching metadata with correlation id 7 : {GKTableJoinDemo-KSTREAM-AGGREGATE-STATE-STORE-0000000006-repartition=UNKNOWN_TOPIC_OR_PARTITION, GKTableJoinDemo-top3-clicks-repartition=UNKNOWN_TOPIC_OR_PARTITION} 
[2022-11-10 19:58:16,089] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"Sports","Clicks":1}] 
[2022-11-10 20:00:27,894] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"Politics","Clicks":1},{"NewsType":"Sports","Clicks":1}] 
[2022-11-10 20:00:30,994] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"LocalNews","Clicks":1},{"NewsType":"Politics","Clicks":1},{"NewsType":"Sports","Clicks":1}] 
[2022-11-10 20:00:55,035] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"LocalNews","Clicks":1},{"NewsType":"Politics","Clicks":1},{"NewsType":"Sports","Clicks":1}] 
[2022-11-10 20:01:15,706] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"LocalNews","Clicks":1},{"NewsType":"Politics","Clicks":1},{"NewsType":"Sports","Clicks":1}] 
[2022-11-10 20:01:15,784] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"WorldNews","Clicks":2},{"NewsType":"LocalNews","Clicks":1},{"NewsType":"Politics","Clicks":1}] 
[2022-11-10 20:01:38,014] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"WorldNews","Clicks":2},{"NewsType":"LocalNews","Clicks":1}] 
[2022-11-10 20:01:38,060] (guru.learningjournal.kafka.examples.GKTableJoinDemo) - INFO k=top3NewsTypes v= [{"NewsType":"Politics","Clicks":2},{"NewsType":"WorldNews","Clicks":2},{"NewsType":"LocalNews","Clicks":1}] 

````