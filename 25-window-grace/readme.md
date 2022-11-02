# window No grace

- Consumer shell - This results when you dont have 
```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/25-window-grace/scripts/start-producer.sh
>STR1534:{"InvoiceNumber": 101,"CreatedTime": "2019-02-05T10:01:00.00Z","StoreID": "STR1534","TotalAmount": 1920}
>STR1534:{"InvoiceNumber": 102,"CreatedTime": "2019-02-05T10:08:10.00Z","StoreID": "STR1534","TotalAmount": 2400}

>STR1534:{"InvoiceNumber": 103,"CreatedTime": "2019-02-05T10:03:00.00Z","StoreID": "STR1534","TotalAmount": 6375}
>
```


-  Console Logs
```
[2022-11-02 09:48:40,560] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 1 
[2022-11-02 09:48:43,751] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2051079849 Window start: 2019-02-05T10:05Z Window end: 2019-02-05T10:10Z Count: 1 
[2022-11-02 09:49:01,515] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 2 
```

---------

# window with grace

```
[2022-11-02 10:30:34,157] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 1 
[2022-11-02 10:30:54,525] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2051079849 Window start: 2019-02-05T10:05Z Window end: 2019-02-05T10:10Z Count: 1 
```

```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/25-window-grace/scripts/start-producer.sh
>STR1534:{"InvoiceNumber": 101,"CreatedTime": "2019-02-05T10:01:00.00Z","StoreID": "STR1534","TotalAmount": 1920}
>STR1534:{"InvoiceNumber": 102,"CreatedTime": "2019-02-05T10:08:10.00Z","StoreID": "STR1534","TotalAmount": 2400}
>STR1534:{"InvoiceNumber": 103,"CreatedTime": "2019-02-05T10:03:00.00Z","StoreID": "STR1534","TotalAmount": 6375}
>
```