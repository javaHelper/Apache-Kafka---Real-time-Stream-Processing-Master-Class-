# window supress

- Console O/P
```
[2022-11-02 14:51:52,080] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO Starting Stream...
[2022-11-02 14:52:13,250] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO App ID: 101 Window ID: 2050359593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:02Z Count: 3 Application is Alive
[2022-11-02 14:52:40,386] (org.apache.kafka.clients.producer.internals.Sender) - WARN [Producer clientId=WindowSuppressApp-c3546b5c-6dc5-4e29-a310-3441e54c8e1d-StreamThread-1-producer] Got error produce response with correlation id 14 on topic-partition WindowSuppressApp-KSTREAM-AGGREGATE-STATE-STORE-0000000001-changelog-0, retrying (2147483646 attempts left). Error: NOT_LEADER_OR_FOLLOWER
[2022-11-02 14:52:40,388] (org.apache.kafka.clients.producer.internals.Sender) - WARN [Producer clientId=WindowSuppressApp-c3546b5c-6dc5-4e29-a310-3441e54c8e1d-StreamThread-1-producer] Received invalid metadata error in produce request on partition WindowSuppressApp-KSTREAM-AGGREGATE-STATE-STORE-0000000001-changelog-0 due to org.apache.kafka.common.errors.NotLeaderOrFollowerException: For requests intended only for the leader, this error indicates that the broker is not the current leader. For requests intended for any replica, this error indicates that the broker is not a replica of the topic partition.. Going to request metadata update now
[2022-11-02 14:52:40,389] (org.apache.kafka.clients.producer.internals.Sender) - WARN [Producer clientId=WindowSuppressApp-c3546b5c-6dc5-4e29-a310-3441e54c8e1d-StreamThread-1-producer] Got error produce response with correlation id 14 on topic-partition WindowSuppressApp-KTABLE-SUPPRESS-STATE-STORE-0000000004-changelog-0, retrying (2147483646 attempts left). Error: NOT_LEADER_OR_FOLLOWER
[2022-11-02 14:52:40,389] (org.apache.kafka.clients.producer.internals.Sender) - WARN [Producer clientId=WindowSuppressApp-c3546b5c-6dc5-4e29-a310-3441e54c8e1d-StreamThread-1-producer] Received invalid metadata error in produce request on partition WindowSuppressApp-KTABLE-SUPPRESS-STATE-STORE-0000000004-changelog-0 due to org.apache.kafka.common.errors.NotLeaderOrFollowerException: For requests intended only for the leader, this error indicates that the broker is not the current leader. For requests intended for any replica, this error indicates that the broker is not a replica of the topic partition.. Going to request metadata update now
[2022-11-02 14:53:13,244] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO App ID: 101 Window ID: 2050479625 Window start: 2019-02-05T10:02Z Window end: 2019-02-05T10:03Z Count: 3 Application is Alive
[2022-11-02 14:53:30,269] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO App ID: 101 Window ID: 2050599913 Window start: 2019-02-05T10:03Z Window end: 2019-02-05T10:04Z Count: 2 Application Failed - Sending Alert Email...
```


```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/28-window-suppress/scripts/start-producer.sh
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:01:08.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:01:32.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:01:58.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:02:12.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:02:49.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:03:08.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:02:59.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:03:48.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:04:15.00Z"}
>
```