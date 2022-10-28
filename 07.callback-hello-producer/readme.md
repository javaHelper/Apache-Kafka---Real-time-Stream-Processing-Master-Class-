# Callback Producer

- logs

```logs
[2022-10-28 22:41:52,318] (guru.learningjournal.kafka.examples.CallbackHelloProducer) - TRACE Creating Kafka Producer... 
[2022-10-28 22:41:53,796] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-1 persisted with offset 0 and timestamp on 2022-10-28 22:41:53.564 
[2022-10-28 22:41:54,637] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-2 persisted with offset 1 and timestamp on 2022-10-28 22:41:54.592 
[2022-10-28 22:41:55,612] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-3 persisted with offset 2 and timestamp on 2022-10-28 22:41:55.598 
[2022-10-28 22:41:56,631] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-4 persisted with offset 3 and timestamp on 2022-10-28 22:41:56.601 
[2022-10-28 22:41:57,631] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-5 persisted with offset 4 and timestamp on 2022-10-28 22:41:57.603 
[2022-10-28 22:41:58,642] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-6 persisted with offset 5 and timestamp on 2022-10-28 22:41:58.61 
[2022-10-28 22:41:59,634] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-7 persisted with offset 6 and timestamp on 2022-10-28 22:41:59.616 
[2022-10-28 22:42:00,643] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-8 persisted with offset 7 and timestamp on 2022-10-28 22:42:00.622 
[2022-10-28 22:42:01,733] (guru.learningjournal.kafka.examples.LoggingCallback) - INFO Simple Message-9 persisted with offset 8 and timestamp on 2022-10-28 22:42:01.628 
[2022-10-28 22:42:02,700] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-10 
[2022-10-28 22:42:03,648] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-11 
[2022-10-28 22:42:04,653] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-12 
[2022-10-28 22:42:05,666] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-13 
[2022-10-28 22:42:06,664] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-14 
[2022-10-28 22:42:07,665] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-15 
[2022-10-28 22:42:08,665] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-16 
[2022-10-28 22:42:09,669] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-17 
[2022-10-28 22:42:10,674] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-18 
[2022-10-28 22:42:11,679] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-19 
[2022-10-28 22:42:12,692] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-20 
[2022-10-28 22:42:13,691] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-21 
[2022-10-28 22:42:14,693] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-22 
[2022-10-28 22:42:15,702] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-23 
[2022-10-28 22:42:16,703] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-24 
[2022-10-28 22:42:17,720] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-25 
[2022-10-28 22:42:18,717] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-26 
[2022-10-28 22:42:19,724] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-27 
[2022-10-28 22:42:20,731] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-28 
[2022-10-28 22:42:21,733] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-29 
[2022-10-28 22:42:22,732] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-30 
[2022-10-28 22:42:23,741] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-31 
[2022-10-28 22:42:24,738] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-32 
[2022-10-28 22:42:25,744] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-33 
[2022-10-28 22:42:26,747] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-34 
[2022-10-28 22:42:27,750] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-35 
[2022-10-28 22:42:28,762] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-36 
[2022-10-28 22:42:29,780] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-37 
[2022-10-28 22:42:30,772] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-38 
[2022-10-28 22:42:31,782] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-39 
[2022-10-28 22:42:32,790] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-40 
[2022-10-28 22:42:33,790] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-41 
[2022-10-28 22:42:34,798] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-42 
[2022-10-28 22:42:35,797] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-43 
[2022-10-28 22:42:36,798] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-44 
[2022-10-28 22:42:37,802] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-45 
[2022-10-28 22:42:38,808] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-46 
[2022-10-28 22:42:39,815] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-47 
[2022-10-28 22:42:40,818] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-48 
[2022-10-28 22:42:41,816] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-49 
[2022-10-28 22:42:42,822] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-50 
[2022-10-28 22:42:43,827] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-51 
[2022-10-28 22:42:44,834] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-52 
[2022-10-28 22:42:45,843] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-53 
[2022-10-28 22:42:46,849] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-54 
[2022-10-28 22:42:47,849] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-55 
[2022-10-28 22:42:48,861] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-56 
[2022-10-28 22:42:49,858] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-57 
[2022-10-28 22:42:50,867] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-58 
[2022-10-28 22:42:51,871] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-59 
[2022-10-28 22:42:52,875] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-60 
[2022-10-28 22:42:53,879] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-61 
[2022-10-28 22:42:54,894] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-62 
[2022-10-28 22:42:55,892] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-63 
[2022-10-28 22:42:56,900] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-64 
[2022-10-28 22:42:57,910] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-65 
[2022-10-28 22:42:58,925] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-66 
[2022-10-28 22:42:59,921] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-67 
[2022-10-28 22:43:00,928] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-68 
[2022-10-28 22:43:01,926] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-69 
[2022-10-28 22:43:02,932] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-70 
[2022-10-28 22:43:03,938] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-71 
[2022-10-28 22:43:04,938] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-72 
[2022-10-28 22:43:05,937] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-73 
[2022-10-28 22:43:06,945] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-74 
[2022-10-28 22:43:07,946] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-75 
[2022-10-28 22:43:08,949] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-76 
[2022-10-28 22:43:09,955] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-77 
[2022-10-28 22:43:10,960] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-78 
[2022-10-28 22:43:11,967] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-79 
[2022-10-28 22:43:12,984] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-80 
[2022-10-28 22:43:13,980] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-81 
[2022-10-28 22:43:14,981] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-82 
[2022-10-28 22:43:15,987] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-83 
[2022-10-28 22:43:16,989] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-84 
[2022-10-28 22:43:18,015] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-85 
[2022-10-28 22:43:19,018] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-86 
[2022-10-28 22:43:20,035] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-87 
[2022-10-28 22:43:21,026] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-88 
[2022-10-28 22:43:22,028] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-89 
[2022-10-28 22:43:23,041] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-90 
[2022-10-28 22:43:24,044] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-91 
[2022-10-28 22:43:25,051] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-92 
[2022-10-28 22:43:26,054] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-93 
[2022-10-28 22:43:27,059] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-94 
[2022-10-28 22:43:28,058] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-95 
[2022-10-28 22:43:29,068] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-96 
[2022-10-28 22:43:30,071] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-97 
[2022-10-28 22:43:31,070] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-98 
[2022-10-28 22:43:32,075] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-99 
[2022-10-28 22:43:33,065] (guru.learningjournal.kafka.examples.CallbackHelloProducer) - INFO Finished Application - Closing Producer. 
[2022-10-28 22:43:33,080] (guru.learningjournal.kafka.examples.LoggingCallback) - ERROR Error sending message string = Simple Message-100 
```

-----

<img width="1318" alt="Screenshot 2022-10-28 at 10 47 01 PM" src="https://user-images.githubusercontent.com/54174687/198695181-c8f28fa0-f808-46b0-9143-e2fca61f5660.png">



