# Counting Window

# Console Output 
```
[2022-11-01 18:49:04,340] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 1
[2022-11-01 18:49:06,261] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 1
[2022-11-01 18:49:11,342] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 2
[2022-11-01 18:49:15,787] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 2
[2022-11-01 18:49:20,531] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3
[2022-11-01 18:49:24,995] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3
[2022-11-01 18:49:29,489] (guru.learningjournal.kafka.examples.CountingWindowApp) - INFO Store ID: STR1534 Window ID: 2051079849 Window start: 2019-02-05T10:05Z Window end: 2019-02-05T10:10Z Count: 1 
```

# Send Data

```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/24-counting-window/scripts/start-producer.sh
>STR1534:{"InvoiceNumber":101,"CreatedTime":"2019-02-05T10:00:10.00Z","StoreID":"STR1534","TotalAmount":1920}
>STR1535:{"InvoiceNumber":102,"CreatedTime":"2019-02-05T10:00:40.00Z","StoreID":"STR1534","TotalAmount":1860}
>STR1534:{"InvoiceNumber":103,"CreatedTime":"2019-02-05T10:01:11.00Z","StoreID":"STR1534","TotalAmount":2400}
>STR1535:{"InvoiceNumber":104,"CreatedTime":"2019-02-05T10:02:11.00Z","StoreID":"STR1534","TotalAmount":8936}
>STR1535:{"InvoiceNumber":105,"CreatedTime":"2019-02-05T10:03:15.00Z","StoreID":"STR1534","TotalAmount":6375}
>STR1534:{"InvoiceNumber":106,"CreatedTime":"2019-02-05T10:04:12.00Z","StoreID":"STR1534","TotalAmount":9365}
>STR1534:{"InvoiceNumber":107,"CreatedTime":"2019-02-05T10:07:11.00Z","StoreID":"STR1534","TotalAmount":5276}
>
```


# Group it By Store ID
```
Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 1
Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 2
Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3
Store ID: STR1534 Window ID: 2051079849 Window start: 2019-02-05T10:05Z Window end: 2019-02-05T10:10Z Count: 1

Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 1
Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 2
Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3
```

------
# Keep only the latest updates for each unique Store ID + Window Id

```
Store ID: STR1534 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3
Store ID: STR1534 Window ID: 2051079849 Window start: 2019-02-05T10:05Z Window end: 2019-02-05T10:10Z Count: 1
Store ID: STR1535 Window ID: 2050479689 Window start: 2019-02-05T10:00Z Window end: 2019-02-05T10:05Z Count: 3 
```

<img width="1148" alt="Screenshot 2022-11-01 at 7 26 24 PM" src="https://user-images.githubusercontent.com/54174687/199250604-2ae650f0-a5fe-479c-bcc1-906fc425c38c.png">

<img width="1017" alt="Screenshot 2022-11-01 at 7 26 39 PM" src="https://user-images.githubusercontent.com/54174687/199250631-a45f775a-03a7-481f-94d2-0ebaddead708.png">

<img width="1063" alt="Screenshot 2022-11-01 at 7 27 05 PM" src="https://user-images.githubusercontent.com/54174687/199250651-4fe192b8-ae47-470c-b2bd-4a2f364fbc30.png">

<img width="993" alt="Screenshot 2022-11-01 at 7 26 53 PM" src="https://user-images.githubusercontent.com/54174687/199250643-1944f540-e908-475c-b92b-6d9e958c59c7.png">

