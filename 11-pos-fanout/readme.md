# Streams Topology
---

<img width="1150" alt="Screenshot 2022-11-04 at 8 18 20 PM" src="https://user-images.githubusercontent.com/54174687/200004338-53729900-e787-49ec-903f-cf1d957facc6.png">


Note: Start Zookepper and 3 node kafka server, also created all topics and start the consumers - hadoop sink and shipment and then start the main app

and then run the pos-simulator app

```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/11-pos-fanout/scripts/start-hadoop-sink-consumer.sh
{"InvoiceNumber":"32722968","CreatedTime":1667130310084,"StoreID":"STR2629","PosID":"POS647","CustomerType":"PRIME","PaymentMethod":"CASH","DeliveryType":"TAKEAWAY","ItemCode":"223","ItemDescription":"Hammock","ItemPrice":1210.0,"ItemQty":2,"TotalValue":2420.0}
{"InvoiceNumber":"32722968","CreatedTime":1667130310084,"StoreID":"STR2629","PosID":"POS647","CustomerType":"PRIME","PaymentMethod":"CASH","DeliveryType":"TAKEAWAY","ItemCode":"408","ItemDescription":"Confidante","ItemPrice":1242.0,"ItemQty":1,"TotalValue":1242.0}
{"InvoiceNumber":"32722968","CreatedTime":1667130310084,"StoreID":"STR2629","PosID":"POS647","CustomerType":"PRIME","PaymentMethod":"CASH","DeliveryType":"TAKEAWAY","ItemCode":"298","ItemDescription":"Bardic chair","ItemPrice":1649.0,"ItemQty":1,"TotalValue":1649.0}
{"InvoiceNumber":"14784776","CreatedTime":1667130310084,"StoreID":"STR6162","PosID":"POS835","CustomerType":"NONPRIME","PaymentMethod":"CARD","DeliveryType":"TAKEAWAY","ItemCode":"213","ItemDescription":"Infant bed","ItemPrice":1755.0,"ItemQty":1,"TotalValue":1755.0}
{"InvoiceNumber":"14784776","CreatedTime":1667130310084,"StoreID":"STR6162","PosID":"POS835","CustomerType":"NONPRIME","PaymentMethod":"CARD","DeliveryType":"TAKEAWAY","ItemCode":"483","ItemDescription":"Teacups and saucers","ItemPrice":1781.0,"ItemQty":2,"TotalValue":3562.0}
{"InvoiceNumber":"14784776","CreatedTime":1667130310084,"StoreID":"STR6162","PosID":"POS835","CustomerType":"NONPRIME","PaymentMethod":"CARD","DeliveryType":"TAKEAWAY","ItemCode":"248","ItemDescription":"TV tray table","ItemPrice":1947.0,"ItemQty":1,"TotalValue":1947.0}
{"InvoiceNumber":"74655072","CreatedTime":1667130310084,"StoreID":"STR7188","PosID":"POS664","CustomerType":"PRIME","PaymentMethod":"CARD","DeliveryType":"HOME-DELIVERY","City":"Ratlam","State":"Madhya Pradesh","PinCode":"925281","ItemCode":"348","ItemDescription":"Navy chair","ItemPrice":1998.0,"ItemQty":1,"TotalValue":1998.0}
{"InvoiceNumber":"74655072","CreatedTime":1667130310084,"StoreID":"STR7188","PosID":"POS664","CustomerType":"PRIME","PaymentMethod":"CARD","DeliveryType":"HOME-DELIVERY","City":"Ratlam","State":"Madhya Pradesh","PinCode":"925281","ItemCode":"553","ItemDescription":"Banjo clock","ItemPrice":1651.0,"ItemQty":2,"TotalValue":3302.0}
{"InvoiceNumber":"77596822","CreatedTime":1667130311428,"StoreID":"STR2629","PosID":"POS285","CustomerType":"NONPRIME","PaymentMethod":"CASH","DeliveryType":"TAKEAWAY","ItemCode":"418","ItemDescription":"Wing chair","ItemPrice":1431.0,"ItemQty":2,"TotalValue":2862.0}

```


```
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/11-pos-fanout/scripts/start-shipment-consumer.sh
{"InvoiceNumber":"74655072","CreatedTime":1667130310084,"StoreID":"STR7188","PosID":"POS664","CashierID":"OAS971","CustomerType":"PRIME","CustomerCardNo":"9316477281","TotalAmount":5300.0,"NumberOfItems":2,"PaymentMethod":"CARD","TaxableAmount":5300.0,"CGST":132.5,"SGST":132.5,"CESS":6.625,"DeliveryType":"HOME-DELIVERY","DeliveryAddress":{"AddressLine":"7114 Eu, Rd.","City":"Ratlam","State":"Madhya Pradesh","PinCode":"925281","ContactNumber":"4057182350"},"InvoiceLineItems":[{"ItemCode":"348","ItemDescription":"Navy chair","ItemPrice":1998.0,"ItemQty":1,"TotalValue":1998.0},{"ItemCode":"553","ItemDescription":"Banjo clock","ItemPrice":1651.0,"ItemQty":2,"TotalValue":3302.0}]}
{"InvoiceNumber":"64346631","CreatedTime":1667130311428,"StoreID":"STR7188","PosID":"POS664","CashierID":"OAS971","CustomerType":"PRIME","CustomerCardNo":"9316477281","TotalAmount":5915.0,"NumberOfItems":3,"PaymentMethod":"CARD","TaxableAmount":5915.0,"CGST":147.875,"SGST":147.875,"CESS":7.39375,"DeliveryType":"HOME-DELIVERY","DeliveryAddress":{"AddressLine":"House No 712, 4763 Turpis Street","City":"Pune","State":"Maharastra","PinCode":"551272","ContactNumber":"3419930245"},"InvoiceLineItems":[{"ItemCode":"488","ItemDescription":"Bread knife","ItemPrice":1077.0,"ItemQty":2,"TotalValue":2154.0},{"ItemCode":"533","ItemDescription":"Rolling ball clock","ItemPrice":1651.0,"ItemQty":1,"TotalValue":1651.0},{"ItemCode":"233","ItemDescription":"Coffee table","ItemPrice":1055.0,"ItemQty":2,"TotalValue":2110.0}]}
{"InvoiceNumber":"31687360","CreatedTime":1667130311428,"StoreID":"STR7255","PosID":"POS115","CashierID":"OAS634","CustomerType":"PRIME","CustomerCardNo":"1682244797","TotalAmount":4139.0,"NumberOfItems":4,"PaymentMethod":"CASH","TaxableAmount":4139.0,"CGST":103.47500000000001,"SGST":103.47500000000001,"CESS":5.17375,"DeliveryType":"HOME-DELIVERY","DeliveryAddress":{"AddressLine":"855-4409 Duis Street","City":"Junagadh","State":"Gujarat","PinCode":"622745","ContactNumber":"6984835508"},"InvoiceLineItems":[{"ItemCode":"338","ItemDescription":"Kneeling chairs","ItemPrice":442.0,"ItemQty":1,"TotalValue":442.0},{"ItemCode":"473","ItemDescription":"Mason jars","ItemPrice":1358.0,"ItemQty":1,"TotalValue":1358.0},{"ItemCode":"383","ItemDescription":"Innerspring Mattress","ItemPrice":655.0,"ItemQty":1,"TotalValue":655.0},{"ItemCode":"608","ItemDescription":"Pleated Drapes","ItemPrice":1684.0,"ItemQty":1,"TotalValue":1684.0}]}
{"InvoiceNumber":"26117779","CreatedTime":1667130312445,"StoreID":"STR6347","PosID":"POS622","CashierID":"OAS793","CustomerType":"PRIME","CustomerCardNo":"5697125813","TotalAmount":5630.0,"NumberOfItems":3,"PaymentMethod":"CARD","TaxableAmount":5630.0,"CGST":140.75,"SGST":140.75,"CESS":7.0375000000000005,"DeliveryType":"HOME-DELIVERY","DeliveryAddress":{"AddressLine":"800-9178 Aliquam Street","City":"Karnal","State":"Haryana","PinCode":"132797","ContactNumber":"6883499359"},"InvoiceLineItems":[{"ItemCode":"548","ItemDescription":"Cartel clock","ItemPrice":1500.0,"ItemQty":1,"TotalValue":1500.0},{"ItemCode":"273","ItemDescription":"Bedroom set","ItemPrice":842.0,"ItemQty":2,"TotalValue":1684.0},{"ItemCode":"328","ItemDescription":"Dining chair","ItemPrice":1223.0,"ItemQty":2,"TotalValue":2446.0}]}

```
<img width="1204" alt="Screenshot 2022-10-30 at 5 22 14 PM" src="https://user-images.githubusercontent.com/54174687/198877016-7f768909-2025-4be0-a0fa-36cb9a96867c.png">

<img width="1200" alt="Screenshot 2022-10-30 at 5 21 04 PM" src="https://user-images.githubusercontent.com/54174687/198877008-5382f83f-4a09-4a3b-80fc-24aed7f2b0a3.png">




<img width="1360" alt="Screenshot 2022-10-28 at 9 11 57 AM" src="https://user-images.githubusercontent.com/54174687/198497711-772b8d8b-be4b-44a4-a0c2-6fae9df9a013.png">

<img width="1359" alt="Screenshot 2022-10-28 at 9 12 19 AM" src="https://user-images.githubusercontent.com/54174687/198497733-32aa7020-59b6-4da2-b61c-14900468bb07.png">
