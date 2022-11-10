# kstream-join

Console 

````
% /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/29-kstream-join/scripts/start-producer-1.sh
>100001:{"TransactionID": "100001", "CreatedTime": "2019-02-14T13:11:00.00Z", "SourceAccountID": "131100", "TargetAccountID": "151837", "Amount": 3000, "OTP": 852960}
>100002:{"TransactionID": "100002", "CreatedTime": "2019-02-14T13:12:00.00Z", "SourceAccountID": "131200", "TargetAccountID": "151837", "Amount": 2000, "OTP": 931749}
>100003:{"TransactionID": "100003", "CreatedTime": "2019-02-14T13:13:00.00Z", "SourceAccountID": "131300", "TargetAccountID": "151837", "Amount": 5000, "OTP": 591296}
>100004:{"TransactionID": "100004", "CreatedTime": "2019-02-14T13:15:00.00Z", "SourceAccountID": "131400", "TargetAccountID": "151837", "Amount": 1000, "OTP": 283084}
>
````

````
% /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/29-kstream-join/scripts/start-producer-2.sh
>100001:{"TransactionID": "100001", "CreatedTime": "2019-02-14T13:15:00.00Z", "OTP": 852960}
>100002:{"TransactionID": "100002", "CreatedTime": "2019-02-14T13:18:00.00Z", "OTP": 931749}
>100004:{"TransactionID": "100004", "CreatedTime": "2019-02-14T13:14:00.00Z", "OTP": 283086}
>
````


````logs
[KSTREAM-MERGE-0000000006]: 100001, guru.learningjournal.kafka.examples.types.TransactionStatus@78cebbe6[transactionID=100001,status=Success]
[KSTREAM-MERGE-0000000006]: 100004, guru.learningjournal.kafka.examples.types.TransactionStatus@34f3299c[transactionID=100004,status=Failure]
````