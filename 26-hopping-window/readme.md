# hopping window

````sh
>STR1534:{"InvoiceNumber": 101,"CreatedTime": "2019-02-05T10:00:10.00Z","StoreID": "STR1534","TotalAmount": 1920}
>STR1534:{"InvoiceNumber": 103,"CreatedTime": "2019-02-05T10:01:11.00Z","StoreID": "STR1534","TotalAmount": 2400}
>STR1534:{"InvoiceNumber": 106,"CreatedTime": "2019-02-05T10:04:12.00Z","StoreID": "STR1534","TotalAmount": 9365}
>STR1534:{"InvoiceNumber": 107,"CreatedTime": "2019-02-05T10:07:11.00Z","StoreID": "STR1534","TotalAmount": 5276}
>
````

- App Logs

````logs
[2022-11-09 16:28:59,778] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2049999689 Window start: 2019-02-05T09:56Z Window end: 2019-02-05T10:01Z Count: 1 
[2022-11-09 16:28:59,783] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050119593 Window start: 2019-02-05T09:57Z Window end: 2019-02-05T10:02Z Count: 2 
[2022-11-09 16:28:59,785] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050239881 Window start: 2019-02-05T09:58Z Window end: 2019-02-05T10:03Z Count: 2 
[2022-11-09 16:28:59,785] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050359913 Window start: 2019-02-05T09:59Z Window end: 2019-02-05T10:04Z Count: 2 
[2022-11-09 16:28:59,786] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3 
[2022-11-09 16:28:59,786] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050599593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:06Z Count: 2 
[2022-11-09 16:28:59,786] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050719625 Window start: 2019-02-05T10:02Z Window end: 2019-02-05T10:07Z Count: 1 
[2022-11-09 16:28:59,786] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050839913 Window start: 2019-02-05T10:03Z Window end: 2019-02-05T10:08Z Count: 2 
[2022-11-09 16:28:59,787] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050959945 Window start: 2019-02-05T10:04Z Window end: 2019-02-05T10:09Z Count: 2 
[2022-11-09 16:28:59,787] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2051079849 Window start: 2019-02-05T10:05Z Window end: 2019-02-05T10:10Z Count: 1 
[2022-11-09 16:28:59,788] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2051199625 Window start: 2019-02-05T10:06Z Window end: 2019-02-05T10:11Z Count: 1 
[2022-11-09 16:28:59,788] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2051319657 Window start: 2019-02-05T10:07Z Window end: 2019-02-05T10:12Z Count: 1 
````