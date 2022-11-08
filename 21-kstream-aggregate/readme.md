# kstream-aggregate

- Steps create topic, run consumer and sent all below details 

```shell
101:{"id": "101", "name": "Prashant", "department": "engineering", "salary": 5000}
102:{"id": "102", "name": "John", "department": "accounts", "salary": 8000}
103:{"id": "103", "name": "Abdul", "department": "engineering", "salary": 3000}
104:{"id": "104", "name": "Melinda", "department": "support", "salary": 7000}
105:{"id": "105", "name": "Jimmy", "department": "support", "salary": 6000}
```



```logs
[Department Salary Average]: accounts, guru.learningjournal.kafka.examples.types.DepartmentAggregate@1e36d255[totalSalary=16000,employeeCount=2,avgSalary=8000.0]
[Department Salary Average]: support, guru.learningjournal.kafka.examples.types.DepartmentAggregate@112e2fa3[totalSalary=20000,employeeCount=3,avgSalary=6666.666666666667]
[Department Salary Average]: engineering, guru.learningjournal.kafka.examples.types.DepartmentAggregate@4a41bf43[totalSalary=16000,employeeCount=4,avgSalary=4000.0]
```