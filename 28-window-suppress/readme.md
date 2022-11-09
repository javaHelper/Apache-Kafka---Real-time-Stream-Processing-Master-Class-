# window supress

- Console O/P
```
[2022-11-09 16:35:03,301] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO Starting Stream... 
[2022-11-09 16:36:02,598] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO App ID: 101 Window ID: 2050359593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:02Z Count: 3 Application is Alive 
[2022-11-09 16:37:05,294] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO App ID: 101 Window ID: 2050479625 Window start: 2019-02-05T10:02Z Window end: 2019-02-05T10:03Z Count: 3 Application is Alive 
[2022-11-09 16:37:15,493] (guru.learningjournal.kafka.examples.WindowSuppressApp) - INFO App ID: 101 Window ID: 2050599913 Window start: 2019-02-05T10:03Z Window end: 2019-02-05T10:04Z Count: 2 Application Failed - Sending Alert Email... 

```


```
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:01:08.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:01:32.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:01:58.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:02:12.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:02:49.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:03:08.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:02:59.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:03:48.00Z"}
>101:{"AppID": 101,"CreatedTime": "2019-02-05T10:04:15.00Z"}

```