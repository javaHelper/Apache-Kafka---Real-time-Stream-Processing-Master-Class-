#

I used confluent kafka from my mac machine to run the example

- To check local state store: `http://localhost:7010/kt01-store/all`

Kafka console

````
prateekashtikar@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/18-streaming-table/scripts/start-producer.sh
>HDFCBANK:1250.00
>TCS:2150.00
>KOTAK:1570
>HDFCBANK:1255.00
>HDFCBANK:
>HDFCBANK:1260
>
````

console app
````logs
[2022-11-08 17:23:03,486] (org.apache.kafka.clients.consumer.ConsumerConfig) - WARN The configuration 'admin.retries' was supplied but isn't a known config. 
[2022-11-08 17:23:03,494] (org.apache.kafka.clients.consumer.ConsumerConfig) - WARN The configuration 'admin.retry.backoff.ms' was supplied but isn't a known config. 
[2022-11-08 17:23:03,578] (guru.learningjournal.kafka.examples.StreamingTableApp) - INFO State Changing to REBALANCING from CREATED 
[2022-11-08 17:23:03,586] (guru.learningjournal.kafka.examples.QueryServer) - INFO Starting Query Server at http://localhost:7010/kt01-store/all 
[2022-11-08 17:23:05,829] (guru.learningjournal.kafka.examples.StreamingTableApp) - INFO State Changing to RUNNING from REBALANCING 
[KT0]: HDFCBANK, 1250.00
[KT1]: HDFCBANK, 1250.00
[KT0]: TCS, 2150.00
[KT1]: TCS, 2150.00
[KT0]: KOTAK, 1570
[KT0]: HDFCBANK, 1255.00
[KT1]: HDFCBANK, 1255.00
[KT0]: HDFCBANK, 
[KT1]: HDFCBANK, null
[KT0]: HDFCBANK, 1260
[KT1]: HDFCBANK, 1260
```