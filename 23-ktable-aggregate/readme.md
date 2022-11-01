# ktable Aggregates

This is from producer console, first send only 5 entry, check result, then 6th check result, 7th entry check result
```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/23-ktable-aggregate/scripts/start-producer.sh
>101:{"id": "101", "name": "Prashant", "department": "engineering", "salary": 5000}
>102:{"id": "102", "name": "John", "department": "accounts", "salary": 8000}
>103:{"id": "103", "name": "Abdul", "department": "engineering", "salary": 3000}
>104:{"id": "104", "name": "Melinda", "department": "support", "salary": 7000}
>105:{"id": "105", "name": "Jimmy", "department": "support", "salary": 6000}


>101:{"id": "101", "name": "Prashant", "department": "support", "salary": 5000}
>104:{"id": "104", "name": "Melinda", "department": "engineering", "salary": 7000}

```

```
[Department Aggregate]: accounts, guru.learningjournal.kafka.examples.types.DepartmentAggregate@5a9979b9[totalSalary=8000,employeeCount=1,avgSalary=8000.0]
[Department Aggregate]: support, guru.learningjournal.kafka.examples.types.DepartmentAggregate@1722bb5b[totalSalary=13000,employeeCount=2,avgSalary=6500.0]
[Department Aggregate]: engineering, guru.learningjournal.kafka.examples.types.DepartmentAggregate@24ceca11[totalSalary=8000,employeeCount=2,avgSalary=4000.0]
[Department Aggregate]: support, guru.learningjournal.kafka.examples.types.DepartmentAggregate@289801d1[totalSalary=18000,employeeCount=3,avgSalary=6000.0]
[Department Aggregate]: engineering, guru.learningjournal.kafka.examples.types.DepartmentAggregate@378de82e[totalSalary=3000,employeeCount=1,avgSalary=3000.0]
[Department Aggregate]: support, guru.learningjournal.kafka.examples.types.DepartmentAggregate@59ec1111[totalSalary=11000,employeeCount=2,avgSalary=5500.0]
[Department Aggregate]: engineering, guru.learningjournal.kafka.examples.types.DepartmentAggregate@ab94509[totalSalary=10000,employeeCount=2,avgSalary=5000.0]
```