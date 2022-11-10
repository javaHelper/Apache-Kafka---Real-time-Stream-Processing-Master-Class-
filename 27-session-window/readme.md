# session window

````
>USR101:{"UserID": "USR101","CreatedTime": "2019-02-05T10:01:00.00Z","CurrentLink": "NULL","NextLink": "Home"}
>USR101:{"UserID": "USR101","CreatedTime": "2019-02-05T10:04:00.00Z","CurrentLink": "Home","NextLink": "Books"}
>USR101:{"UserID": "USR101","CreatedTime": "2019-02-05T10:10:00.00Z","CurrentLink": "Books","NextLink": "Kafka"}

>USR102:{"UserID": "USR102","CreatedTime": "2019-02-05T10:02:00.00Z","CurrentLink": "NULL","NextLink": "Home"}
>USR102:{"UserID": "USR102","CreatedTime": "2019-02-05T10:10:00.00Z","CurrentLink": "Home","NextLink": "Courses"}
>USR101:{"UserID": "USR101","CreatedTime": "2019-02-05T10:07:00.00Z","CurrentLink": "Kafka","NextLink": "Preview"}
>USR101:{"UserID": "USR101","CreatedTime": "2019-02-05T10:19:00.00Z","CurrentLink": "Preview","NextLink": "Buy"}
````

- Response

````logs
[2022-11-09 20:59:59,140] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO Starting Stream... 
[2022-11-10 11:12:18,124] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2050299593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:01Z Count: 1 
[2022-11-10 11:14:56,601] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2050299593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:01Z Count: null 
[2022-11-10 11:14:56,603] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2050479593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:04Z Count: 2 
[2022-11-10 11:17:51,678] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2051379881 Window start: 2019-02-05T10:10Z Window end: 2019-02-05T10:10Z Count: 1 
[2022-11-10 11:18:34,352] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR102 Window ID: 2050419625 Window start: 2019-02-05T10:02Z Window end: 2019-02-05T10:02Z Count: 1 
[2022-11-10 11:18:21,976] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR102 Window ID: 2051379881 Window start: 2019-02-05T10:10Z Window end: 2019-02-05T10:10Z Count: 1 
[2022-11-10 11:18:45,011] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2050479593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:04Z Count: null 
[2022-11-10 11:18:45,012] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2051379881 Window start: 2019-02-05T10:10Z Window end: 2019-02-05T10:10Z Count: null 
[2022-11-10 11:18:45,013] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2050839593 Window start: 2019-02-05T10:01Z Window end: 2019-02-05T10:10Z Count: 4 
[2022-11-10 11:18:54,195] (guru.learningjournal.kafka.examples.CountingSessionApp) - INFO User ID: USR101 Window ID: 2052459913 Window start: 2019-02-05T10:19Z Window end: 2019-02-05T10:19Z Count: 1 
````