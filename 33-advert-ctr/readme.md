#

Console Producer 1

````
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/33-advert-ctr/scripts/3-start-producer-1.sh
>100001:{"ImpressionID": "100001", "Campaigner": "ABC Ltd"}
>100002:{"ImpressionID": "100002", "Campaigner": "XYZ Ltd"}
>100003:{"ImpressionID": "100003", "Campaigner": "XYZ Ltd"}
>100004:{"ImpressionID": "100004", "Campaigner": "XYZ Ltd"}
>100005:{"ImpressionID": "100005", "Campaigner": "XYZ Ltd"}
>100006:{"ImpressionID": "100006", "Campaigner": "ABC Ltd"}
>100007:{"ImpressionID": "100007", "Campaigner": "ABC Ltd"}
>100008:{"ImpressionID": "100008", "Campaigner": "ABC Ltd"}
>100009:{"ImpressionID": "100009", "Campaigner": "ABC Ltd"}
>100010:{"ImpressionID": "100010", "Campaigner": "ABC Ltd"}
>
````

Console Producer 2

````
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/33-advert-ctr/scripts/6-start-producer-2.sh
>100009:{"ImpressionID": "100009", "Campaigner": "ABC Ltd"}
>100010:{"ImpressionID": "100010", "Campaigner": "ABC Ltd"}
>100002:{"ImpressionID": "100002", "Campaigner": "XYZ Ltd"}
````

App logs - 

````shell
[2022-11-10 20:21:50,065] (guru.learningjournal.kafka.examples.AdvertCTRDemo) - INFO Starting Stream... 
[2022-11-10 20:21:50,472] (org.apache.kafka.clients.consumer.ConsumerConfig) - WARN The configuration 'admin.retries' was supplied but isn't a known config. 
[2022-11-10 20:21:50,473] (org.apache.kafka.clients.consumer.ConsumerConfig) - WARN The configuration 'admin.retry.backoff.ms' was supplied but isn't a known config. 
[2022-11-10 20:22:20,795] (guru.learningjournal.kafka.examples.AdvertCTRDemo) - INFO guru.learningjournal.kafka.examples.types.CampaignPerformance@41846f07[campaigner=ABC Ltd,adImpressions=6,adClicks=2] 
[2022-11-10 20:22:20,809] (guru.learningjournal.kafka.examples.AdvertCTRDemo) - INFO guru.learningjournal.kafka.examples.types.CampaignPerformance@3f81de54[campaigner=ABC Ltd,adImpressions=6,adClicks=2] 
[2022-11-10 20:22:20,877] (guru.learningjournal.kafka.examples.AdvertCTRDemo) - INFO guru.learningjournal.kafka.examples.types.CampaignPerformance@1fa661b8[campaigner=XYZ Ltd,adImpressions=4,adClicks=1] 
[2022-11-10 20:22:20,879] (guru.learningjournal.kafka.examples.AdvertCTRDemo) - INFO guru.learningjournal.kafka.examples.types.CampaignPerformance@63743c70[campaigner=XYZ Ltd,adImpressions=4,adClicks=1] 
````