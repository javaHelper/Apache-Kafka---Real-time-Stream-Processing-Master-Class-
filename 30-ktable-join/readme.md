# ktable join

````
% /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/30-ktable-join/scripts/start-producer-1.sh
>100001:{"UserName": "Prashant", "LoginID": "100001", "LastLogin": "2019-01-01T00:00:00.00Z"}
>100009:{"UserName": "Alisha",   "LoginID": "100009", "LastLogin": "2019-01-01T00:00:00.00Z"}
>100087:{"UserName": "Abdul",    "LoginID": "100087", "LastLogin": "2019-01-01T00:00:00.00Z"}
>
````


````
prateekashtikar@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/30-ktable-join/scripts/start-producer-2.sh
>100001:{"LoginID": "100001", "CreatedTime": "2019-02-14T13:01:15.00Z"}
>100087:{"LoginID": "100087", "CreatedTime": "2019-02-14T13:01:18.00Z"}
>
````


````
[2022-11-10 14:50:25,139] (guru.learningjournal.kafka.examples.KTableJoinDemo) - INFO Starting Stream... 
[KTABLE-TOSTREAM-0000000009]: 100001, guru.learningjournal.kafka.examples.types.UserDetails@1304c9ee[userName=Prashant,loginID=100001,lastLogin=2019-02-14T13:01:15.00Z]
[KTABLE-TOSTREAM-0000000009]: 100087, guru.learningjournal.kafka.examples.types.UserDetails@521c3889[userName=Abdul,loginID=100087,lastLogin=2019-02-14T13:01:18.00Z]
````