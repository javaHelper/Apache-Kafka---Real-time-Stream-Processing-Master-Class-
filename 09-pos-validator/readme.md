# pos simulator 

>>> `Note: Please run the 05-pos-simulator demo first.`

- console of pos-smulator

```logs
[2022-10-30 15:47:12,224] (guru.learningjournal.kafka.examples.RunnableProducer) - INFO Starting producer thread - 1 
[2022-10-30 15:47:12,224] (guru.learningjournal.kafka.examples.RunnableProducer) - INFO Starting producer thread - 2 
[2022-10-30 15:47:12,224] (guru.learningjournal.kafka.examples.RunnableProducer) - INFO Starting producer thread - 0 
[2022-10-30 15:47:12,281] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@55222083[invoiceNumber=7967718,createdTime=1667125032233,storeID=STR6162,posID=POS835,cashierID=OAS583,customerType=NONPRIME,customerCardNo=5611417583,totalAmount=2934.0,numberOfItems=1,paymentMethod=CARD,taxableAmount=2934.0,cGST=73.35000000000001,sGST=73.35000000000001,cESS=3.6675,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@3055ddd2[itemCode=468,itemDescription=Lunch box,itemPrice=1467.0,itemQty=2,totalValue=2934.0]]] 
[2022-10-30 15:47:12,281] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@4b9c20ad[invoiceNumber=100019631,createdTime=1667125032233,storeID=STR1534,posID=POS944,cashierID=OAS994,customerType=NONPRIME,customerCardNo=2968880358,totalAmount=4279.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=4279.0,cGST=106.97500000000001,sGST=106.97500000000001,cESS=5.34875,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@4ba6251d[addressLine=853-9772 Enim, Avenue,city=Allappuzha,state=Kerala,pinCode=140312,contactNumber=5528409181],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@16752a65[itemCode=498,itemDescription=Carving knifes,itemPrice=1424.0,itemQty=2,totalValue=2848.0], guru.learningjournal.kafka.examples.types.LineItem@3d51363b[itemCode=418,itemDescription=Wing chair,itemPrice=1431.0,itemQty=1,totalValue=1431.0]]] 
[2022-10-30 15:47:12,286] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@58d7f468[invoiceNumber=98954431,createdTime=1667125032233,storeID=STR2629,posID=POS768,cashierID=OAS282,customerType=NONPRIME,customerCardNo=1360645962,totalAmount=2363.0,numberOfItems=2,paymentMethod=CARD,taxableAmount=2363.0,cGST=59.075,sGST=59.075,cESS=2.95375,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@6dd7b031[addressLine=735-1235 Pretium Street,city=Unnao,state=Uttar Pradesh,pinCode=103540,contactNumber=4331966638],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@2d45e193[itemCode=618,itemDescription=Pencil Pleat Drapes,itemPrice=1140.0,itemQty=1,totalValue=1140.0], guru.learningjournal.kafka.examples.types.LineItem@32b8cb16[itemCode=328,itemDescription=Dining chair,itemPrice=1223.0,itemQty=1,totalValue=1223.0]]] 
[2022-10-30 15:47:13,606] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@20de4b71[invoiceNumber=86947482,createdTime=1667125033604,storeID=STR2952,posID=POS152,cashierID=OAS329,customerType=PRIME,customerCardNo=3027514652,totalAmount=5466.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=5466.0,cGST=136.65,sGST=136.65,cESS=6.8325000000000005,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@bf49e48[itemCode=293,itemDescription=Bar stool,itemPrice=1148.0,itemQty=2,totalValue=2296.0], guru.learningjournal.kafka.examples.types.LineItem@43a8ee97[itemCode=353,itemDescription=Recliner,itemPrice=1585.0,itemQty=2,totalValue=3170.0]]] 
[2022-10-30 15:47:13,606] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@26b67201[invoiceNumber=52976668,createdTime=1667125033603,storeID=STR1534,posID=POS151,cashierID=OAS177,customerType=NONPRIME,customerCardNo=7061658033,totalAmount=7303.0,numberOfItems=3,paymentMethod=CASH,taxableAmount=7303.0,cGST=182.57500000000002,sGST=182.57500000000002,cESS=9.12875,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@5fb8bd06[addressLine=Flat No. #735-431 Gravida. St.,city=Chapra,state=Bihar,pinCode=386153,contactNumber=2004897617],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@4c4df14c[itemCode=628,itemDescription=Window Scarf,itemPrice=1774.0,itemQty=2,totalValue=3548.0], guru.learningjournal.kafka.examples.types.LineItem@785696fb[itemCode=358,itemDescription=Restraint chair,itemPrice=1943.0,itemQty=1,totalValue=1943.0], guru.learningjournal.kafka.examples.types.LineItem@6d65c58a[itemCode=288,itemDescription=Hutch,itemPrice=1812.0,itemQty=1,totalValue=1812.0]]] 
[2022-10-30 15:47:13,606] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@6ef225d1[invoiceNumber=82469425,createdTime=1667125033603,storeID=STR7443,posID=POS333,cashierID=OAS883,customerType=NONPRIME,customerCardNo=5483488802,totalAmount=6988.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=6988.0,cGST=174.70000000000002,sGST=174.70000000000002,cESS=8.735,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@d6c9445[addressLine=291-4367 Aliquam St.,city=Pali,state=Rajasthan,pinCode=906511,contactNumber=7544884134],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@145caf00[itemCode=368,itemDescription=Stool,itemPrice=888.0,itemQty=1,totalValue=888.0], guru.learningjournal.kafka.examples.types.LineItem@3d6798b9[itemCode=668,itemDescription=Crab cracker,itemPrice=785.0,itemQty=1,totalValue=785.0], guru.learningjournal.kafka.examples.types.LineItem@42c4ee69[itemCode=248,itemDescription=TV tray table,itemPrice=1947.0,itemQty=1,totalValue=1947.0], guru.learningjournal.kafka.examples.types.LineItem@2b6394c8[itemCode=608,itemDescription=Pleated Drapes,itemPrice=1684.0,itemQty=2,totalValue=3368.0]]] 
[2022-10-30 15:47:14,618] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@5b95e3a4[invoiceNumber=8328401,createdTime=1667125034614,storeID=STR6382,posID=POS145,cashierID=OAS872,customerType=PRIME,customerCardNo=6733153948,totalAmount=888.0,numberOfItems=1,paymentMethod=CARD,taxableAmount=888.0,cGST=22.200000000000003,sGST=22.200000000000003,cESS=1.11,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@3e47f919[addressLine=Flat No. #420-9203 Pretium Street,city=Dehri,state=Bihar,pinCode=392400,contactNumber=3841876454],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@145caf00[itemCode=368,itemDescription=Stool,itemPrice=888.0,itemQty=1,totalValue=888.0]]] 
[2022-10-30 15:47:14,618] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@7e077dfa[invoiceNumber=18558656,createdTime=1667125034614,storeID=STR2952,posID=POS663,cashierID=OAS444,customerType=NONPRIME,customerCardNo=7928716562,totalAmount=6932.0,numberOfItems=3,paymentMethod=CASH,taxableAmount=6932.0,cGST=173.3,sGST=173.3,cESS=8.665000000000001,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@512ebaac[addressLine=7114 Eu, Rd.,city=Ratlam,state=Madhya Pradesh,pinCode=925281,contactNumber=4057182350],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@55762a48[itemCode=513,itemDescription=Flip clock,itemPrice=1259.0,itemQty=2,totalValue=2518.0], guru.learningjournal.kafka.examples.types.LineItem@78fd388a[itemCode=593,itemDescription=Hanging curtains,itemPrice=1896.0,itemQty=1,totalValue=1896.0], guru.learningjournal.kafka.examples.types.LineItem@55762a48[itemCode=513,itemDescription=Flip clock,itemPrice=1259.0,itemQty=2,totalValue=2518.0]]] 
[2022-10-30 15:47:14,618] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@54cb5d85[invoiceNumber=23840886,createdTime=1667125034614,storeID=STR4899,posID=POS441,cashierID=OAS487,customerType=NONPRIME,customerCardNo=4227803954,totalAmount=888.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=888.0,cGST=22.200000000000003,sGST=22.200000000000003,cESS=1.11,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@145caf00[itemCode=368,itemDescription=Stool,itemPrice=888.0,itemQty=1,totalValue=888.0]]] 
[2022-10-30 15:47:15,623] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@5bec37aa[invoiceNumber=99345588,createdTime=1667125035621,storeID=STR8311,posID=POS975,cashierID=OAS881,customerType=NONPRIME,customerCardNo=4680751410,totalAmount=3712.0,numberOfItems=2,paymentMethod=CARD,taxableAmount=3712.0,cGST=92.80000000000001,sGST=92.80000000000001,cESS=4.64,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@54615307[itemCode=283,itemDescription=Portable Lamps,itemPrice=2236.0,itemQty=1,totalValue=2236.0], guru.learningjournal.kafka.examples.types.LineItem@5a480b7b[itemCode=243,itemDescription=Folding table,itemPrice=738.0,itemQty=2,totalValue=1476.0]]] 
[2022-10-30 15:47:15,633] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@19e3cf9d[invoiceNumber=47091002,createdTime=1667125035633,storeID=STR2629,posID=POS647,cashierID=OAS515,customerType=PRIME,customerCardNo=1053863739,totalAmount=3145.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=3145.0,cGST=78.625,sGST=78.625,cESS=3.93125,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@3d51363b[itemCode=418,itemDescription=Wing chair,itemPrice=1431.0,itemQty=1,totalValue=1431.0], guru.learningjournal.kafka.examples.types.LineItem@26f4f90e[itemCode=308,itemDescription=Butterfly chair,itemPrice=857.0,itemQty=2,totalValue=1714.0]]] 
[2022-10-30 15:47:15,634] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@625a23ee[invoiceNumber=78665263,createdTime=1667125035633,storeID=STR7449,posID=POS728,cashierID=OAS323,customerType=PRIME,customerCardNo=5301477438,totalAmount=1485.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=1485.0,cGST=37.125,sGST=37.125,cESS=1.85625,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@4b1fedf1[itemCode=423,itemDescription=Quilt,itemPrice=1485.0,itemQty=1,totalValue=1485.0]]] 
[2022-10-30 15:47:16,639] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@68cad08a[invoiceNumber=5350274,createdTime=1667125036632,storeID=STR6162,posID=POS279,cashierID=OAS964,customerType=PRIME,customerCardNo=2262471989,totalAmount=3196.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=3196.0,cGST=79.9,sGST=79.9,cESS=3.995,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@3814dbdc[addressLine=855-4409 Duis Street,city=Junagadh,state=Gujarat,pinCode=622745,contactNumber=6984835508],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@3c83cd02[itemCode=518,itemDescription=Hourglass,itemPrice=1598.0,itemQty=2,totalValue=3196.0]]] 
[2022-10-30 15:47:16,640] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@625a23ee[invoiceNumber=3822949,createdTime=1667125036639,storeID=STR7449,posID=POS728,cashierID=OAS323,customerType=PRIME,customerCardNo=5301477438,totalAmount=3814.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=3814.0,cGST=95.35000000000001,sGST=95.35000000000001,cESS=4.7675,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@59092cb7[itemCode=338,itemDescription=Kneeling chairs,itemPrice=442.0,itemQty=1,totalValue=442.0], guru.learningjournal.kafka.examples.types.LineItem@6a7f212b[itemCode=203,itemDescription=Bunk bed,itemPrice=1686.0,itemQty=2,totalValue=3372.0]]] 
[2022-10-30 15:47:16,642] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@6a21bfba[invoiceNumber=1056169,createdTime=1667125036639,storeID=STR2629,posID=POS285,cashierID=OAS882,customerType=NONPRIME,customerCardNo=6419885098,totalAmount=4728.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=4728.0,cGST=118.2,sGST=118.2,cESS=5.91,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@6d390a44[itemCode=343,itemDescription=Massage chair,itemPrice=1354.0,itemQty=1,totalValue=1354.0], guru.learningjournal.kafka.examples.types.LineItem@6c04a264[itemCode=258,itemDescription=Closet,itemPrice=1687.0,itemQty=2,totalValue=3374.0]]] 
[2022-10-30 15:47:17,658] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@3ffb5e3f[invoiceNumber=58550020,createdTime=1667125037650,storeID=STR7443,posID=POS388,cashierID=OAS436,customerType=PRIME,customerCardNo=8714158103,totalAmount=2066.0,numberOfItems=2,paymentMethod=CASH,taxableAmount=2066.0,cGST=51.650000000000006,sGST=51.650000000000006,cESS=2.5825,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@7625dc26[addressLine=6363 Non Rd.,city=Darbhanga,state=Bihar,pinCode=570288,contactNumber=5656699770],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@16752a65[itemCode=498,itemDescription=Carving knifes,itemPrice=1424.0,itemQty=1,totalValue=1424.0], guru.learningjournal.kafka.examples.types.LineItem@7ea0e7a9[itemCode=573,itemDescription=Eyelet Curtains,itemPrice=642.0,itemQty=1,totalValue=642.0]]] 
[2022-10-30 15:47:17,658] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@6ed26349[invoiceNumber=18537905,createdTime=1667125037648,storeID=STR5494,posID=POS722,cashierID=OAS576,customerType=PRIME,customerCardNo=9724245321,totalAmount=3302.0,numberOfItems=1,paymentMethod=CASH,taxableAmount=3302.0,cGST=82.55000000000001,sGST=82.55000000000001,cESS=4.1275,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@7e2e96b0[addressLine=Flat No. #398-2797 A Rd.,city=Sikar,state=Rajasthan,pinCode=660265,contactNumber=1131794401],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@6d4b8627[itemCode=553,itemDescription=Banjo clock,itemPrice=1651.0,itemQty=2,totalValue=3302.0]]] 
[2022-10-30 15:47:17,659] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@33613371[invoiceNumber=42366419,createdTime=1667125037647,storeID=STR1955,posID=POS324,cashierID=OAS183,customerType=NONPRIME,customerCardNo=3916555911,totalAmount=5260.0,numberOfItems=3,paymentMethod=CASH,taxableAmount=5260.0,cGST=131.5,sGST=131.5,cESS=6.575,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@2db5d4fa[addressLine=Flat No. #131-5960 Varius St.,city=Ongole,state=Andhra Pradesh,pinCode=881860,contactNumber=6735030289],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@ffcf793[itemCode=558,itemDescription=Balloon clock,itemPrice=1633.0,itemQty=1,totalValue=1633.0], guru.learningjournal.kafka.examples.types.LineItem@785696fb[itemCode=358,itemDescription=Restraint chair,itemPrice=1943.0,itemQty=1,totalValue=1943.0], guru.learningjournal.kafka.examples.types.LineItem@d093511[itemCode=273,itemDescription=Bedroom set,itemPrice=842.0,itemQty=2,totalValue=1684.0]]] 
[2022-10-30 15:47:18,692] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@5a35b88b[invoiceNumber=5482948,createdTime=1667125038679,storeID=STR7449,posID=POS923,cashierID=OAS748,customerType=NONPRIME,customerCardNo=1422009832,totalAmount=1955.0,numberOfItems=1,paymentMethod=CARD,taxableAmount=1955.0,cGST=48.875,sGST=48.875,cESS=2.44375,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@63ae6ed4[addressLine=7947 Mauris, Av.,city=Tambaram,state=Tamil Nadu,pinCode=339533,contactNumber=5898142373],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@15213f00[itemCode=643,itemDescription=Blow torch,itemPrice=1955.0,itemQty=1,totalValue=1955.0]]] 
[2022-10-30 15:47:18,692] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@2b3e5523[invoiceNumber=75983312,createdTime=1667125038679,storeID=STR8311,posID=POS377,cashierID=OAS478,customerType=NONPRIME,customerCardNo=8670468851,totalAmount=7807.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=7807.0,cGST=195.175,sGST=195.175,cESS=9.758750000000001,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@121eba89[itemCode=533,itemDescription=Rolling ball clock,itemPrice=1651.0,itemQty=2,totalValue=3302.0], guru.learningjournal.kafka.examples.types.LineItem@75db01c5[itemCode=478,itemDescription=Teapot,itemPrice=885.0,itemQty=2,totalValue=1770.0], guru.learningjournal.kafka.examples.types.LineItem@3d6798b9[itemCode=668,itemDescription=Crab cracker,itemPrice=785.0,itemQty=1,totalValue=785.0], guru.learningjournal.kafka.examples.types.LineItem@64909a3c[itemCode=433,itemDescription=Depression glass,itemPrice=1950.0,itemQty=1,totalValue=1950.0]]] 
[2022-10-30 15:47:18,692] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@2b3e5523[invoiceNumber=68554504,createdTime=1667125038679,storeID=STR8311,posID=POS377,cashierID=OAS478,customerType=NONPRIME,customerCardNo=8670468851,totalAmount=7807.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=7807.0,cGST=195.175,sGST=195.175,cESS=9.758750000000001,deliveryType=TAKEAWAY,deliveryAddress=<null>,invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@121eba89[itemCode=533,itemDescription=Rolling ball clock,itemPrice=1651.0,itemQty=2,totalValue=3302.0], guru.learningjournal.kafka.examples.types.LineItem@75db01c5[itemCode=478,itemDescription=Teapot,itemPrice=885.0,itemQty=2,totalValue=1770.0], guru.learningjournal.kafka.examples.types.LineItem@3d6798b9[itemCode=668,itemDescription=Crab cracker,itemPrice=785.0,itemQty=1,totalValue=785.0], guru.learningjournal.kafka.examples.types.LineItem@64909a3c[itemCode=433,itemDescription=Depression glass,itemPrice=1950.0,itemQty=1,totalValue=1950.0]]] 
[2022-10-30 15:47:19,707] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@3d5e5cc0[invoiceNumber=48405775,createdTime=1667125039701,storeID=STR2629,posID=POS172,cashierID=OAS622,customerType=NONPRIME,customerCardNo=7829975914,totalAmount=11366.0,numberOfItems=3,paymentMethod=CASH,taxableAmount=11366.0,cGST=284.15000000000003,sGST=284.15000000000003,cESS=14.2075,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@5af37310[addressLine=House No 556, 2384 Libero. Rd.,city=Banda,state=Uttar Pradesh,pinCode=767511,contactNumber=9801318492],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@778b94a2[itemCode=428,itemDescription=Cocktail glass,itemPrice=1422.0,itemQty=2,totalValue=2844.0], guru.learningjournal.kafka.examples.types.LineItem@17aaa115[itemCode=378,itemDescription=Air Bed,itemPrice=2263.0,itemQty=2,totalValue=4526.0], guru.learningjournal.kafka.examples.types.LineItem@585d477c[itemCode=348,itemDescription=Navy chair,itemPrice=1998.0,itemQty=2,totalValue=3996.0]]] 
[2022-10-30 15:47:19,707] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@6252533b[invoiceNumber=91758463,createdTime=1667125039697,storeID=STR3781,posID=POS129,cashierID=OAS311,customerType=PRIME,customerCardNo=4692642935,totalAmount=7185.0,numberOfItems=4,paymentMethod=CASH,taxableAmount=7185.0,cGST=179.625,sGST=179.625,cESS=8.981250000000001,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@729a596b[addressLine=Flat No. #316-5621 Laoreet St.,city=Nellore,state=Andhra Pradesh,pinCode=333433,contactNumber=5232382321],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@6edfa107[itemCode=563,itemDescription=Chiming clock,itemPrice=2168.0,itemQty=1,totalValue=2168.0], guru.learningjournal.kafka.examples.types.LineItem@59bbff36[itemCode=463,itemDescription=Cookie jars,itemPrice=793.0,itemQty=1,totalValue=793.0], guru.learningjournal.kafka.examples.types.LineItem@2900b4b1[itemCode=373,itemDescription=Latex Mattress,itemPrice=1313.0,itemQty=2,totalValue=2626.0], guru.learningjournal.kafka.examples.types.LineItem@3c83cd02[itemCode=518,itemDescription=Hourglass,itemPrice=1598.0,itemQty=1,totalValue=1598.0]]] 
[2022-10-30 15:47:19,707] (guru.learningjournal.kafka.examples.datagenerator.InvoiceGenerator) - DEBUG guru.learningjournal.kafka.examples.types.PosInvoice@4e5603c5[invoiceNumber=25784359,createdTime=1667125039698,storeID=STR7449,posID=POS215,cashierID=OAS663,customerType=PRIME,customerCardNo=3453134392,totalAmount=8501.0,numberOfItems=4,paymentMethod=CARD,taxableAmount=8501.0,cGST=212.525,sGST=212.525,cESS=10.62625,deliveryType=HOME-DELIVERY,deliveryAddress=guru.learningjournal.kafka.examples.types.DeliveryAddress@4f8cfcb3[addressLine=3122 Morbi Ave,city=Palakkad,state=Kerala,pinCode=800459,contactNumber=8235927974],invoiceLineItems=[guru.learningjournal.kafka.examples.types.LineItem@1d9e65f6[itemCode=438,itemDescription=Lead glass,itemPrice=2069.0,itemQty=2,totalValue=4138.0], guru.learningjournal.kafka.examples.types.LineItem@3d6798b9[itemCode=668,itemDescription=Crab cracker,itemPrice=785.0,itemQty=1,totalValue=785.0], guru.learningjournal.kafka.examples.types.LineItem@7473dc2c[itemCode=603,itemDescription=Sheer Curtains,itemPrice=1282.0,itemQty=1,totalValue=1282.0], guru.learningjournal.kafka.examples.types.LineItem@bf49e48[itemCode=293,itemDescription=Bar stool,itemPrice=1148.0,itemQty=2,totalValue=2296.0]]]

....
....
```

- console logs from pos-validator

```logs
[2022-10-30 15:47:35,332] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 7967718 
[2022-10-30 15:47:35,337] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 98954431 
[2022-10-30 15:47:35,337] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 47091002 
[2022-10-30 15:47:35,338] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 5350274 
[2022-10-30 15:47:35,340] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 1056169 
[2022-10-30 15:47:35,341] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 18537905 
[2022-10-30 15:47:35,341] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 42366419 
[2022-10-30 15:47:35,365] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 91758463 
[2022-10-30 15:47:35,369] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 48405775 
[2022-10-30 15:47:35,375] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 65547837 
[2022-10-30 15:47:35,376] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 52637364 
[2022-10-30 15:47:35,378] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 59921873 
[2022-10-30 15:47:35,381] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 19785049 
[2022-10-30 15:47:35,382] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 51706759 
[2022-10-30 15:47:35,386] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 1597491 
[2022-10-30 15:47:35,394] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 42910629 
[2022-10-30 15:47:35,394] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 45326847 
[2022-10-30 15:47:35,395] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 40689486 
[2022-10-30 15:47:35,396] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 29237414 
[2022-10-30 15:47:35,397] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 22274956 
[2022-10-30 15:47:35,397] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 47991032 
[2022-10-30 15:47:35,398] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 37088789 
[2022-10-30 15:47:35,400] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 82469425 
[2022-10-30 15:47:35,402] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 23840886 
[2022-10-30 15:47:35,403] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 58550020 
[2022-10-30 15:47:35,403] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 49774483 
[2022-10-30 15:47:35,407] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 26045978 
[2022-10-30 15:47:35,410] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 32192259 
[2022-10-30 15:47:35,410] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 27477518 
[2022-10-30 15:47:35,411] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 24470215 
[2022-10-30 15:47:35,417] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 21322572 
[2022-10-30 15:47:35,418] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 99042067 
[2022-10-30 15:47:35,419] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 51655991 
[2022-10-30 15:47:35,419] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 44605277 
[2022-10-30 15:47:35,456] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 44134891 
[2022-10-30 15:47:35,456] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 100019631 
[2022-10-30 15:47:35,458] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 52976668 
[2022-10-30 15:47:35,460] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 86947482 
[2022-10-30 15:47:35,461] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 8328401 
[2022-10-30 15:47:35,462] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 18558656 
[2022-10-30 15:47:35,462] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 99345588 
[2022-10-30 15:47:35,462] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 78665263 
[2022-10-30 15:47:35,462] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 3822949 
[2022-10-30 15:47:35,463] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 5482948 
[2022-10-30 15:47:35,463] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 68554504 
[2022-10-30 15:47:35,463] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 68554504 
[2022-10-30 15:47:35,463] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 25784359 
[2022-10-30 15:47:35,463] (guru.learningjournal.kafka.examples.PosValidator) - INFO valid record - 79905249 
```

consumer

```sh
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/09-pos-validator/scripts/1.valid-pos-consumer.sh
{"InvoiceNumber":"7967718","CreatedTime":1667125032233,"StoreID":"STR6162","PosID":"POS835","CashierID":"OAS583","CustomerType":"NONPRIME","CustomerCardNo":"5611417583","TotalAmount":2934.0,"NumberOfItems":1,"PaymentMethod":"CARD","TaxableAmount":2934.0,"CGST":73.35000000000001,"SGST":73.35000000000001,"CESS":3.6675,"DeliveryType":"TAKEAWAY","InvoiceLineItems":[{"ItemCode":"468","ItemDescription":"Lunch box","ItemPrice":1467.0,"ItemQty":2,"TotalValue":2934.0}]}
{"InvoiceNumber":"98954431","CreatedTime":1667125032233,"StoreID":"STR2629","PosID":"POS768","CashierID":"OAS282","CustomerType":"NONPRIME","CustomerCardNo":"1360645962","TotalAmount":2363.0,"NumberOfItems":2,"PaymentMethod":"CARD","TaxableAmount":2363.0,"CGST":59.075,"SGST":59.075,"CESS":2.95375,"DeliveryType":"HOME-DELIVERY","DeliveryAddress":{"AddressLine":"735-1235 Pretium Street","City":"Unnao","State":"Uttar Pradesh","PinCode":"103540","ContactNumber":"4331966638"},"InvoiceLineItems":[{"ItemCode":"618","ItemDescription":"Pencil Pleat Drapes","ItemPrice":1140.0,"ItemQty":1,"TotalValue":1140.0},{"ItemCode":"328","ItemDescription":"Dining chair","ItemPrice":1223.0,"ItemQty":1,"TotalValue":1223.0}]}
{"InvoiceNumber":"47091002","CreatedTime":1667125035633,"StoreID":"STR2629","PosID":"POS647","CashierID":"OAS515","CustomerType":"PRIME","CustomerCardNo":"1053863739","TotalAmount":3145.0,"NumberOfItems":2,"PaymentMethod":"CASH","TaxableAmount":3145.0,"CGST":78.625,"SGST":78.625,"CESS":3.93125,"DeliveryType":"TAKEAWAY","InvoiceLineItems":[{"ItemCode":"418","ItemDescription":"Wing chair","ItemPrice":1431.0,"ItemQty":1,"TotalValue":1431.0},{"ItemCode":"308","ItemDescription":"Butterfly chair","ItemPrice":857.0,"ItemQty":2,"TotalValue":1714.0}]}
{"InvoiceNumber":"5350274","CreatedTime":1667125036632,"StoreID":"STR6162","PosID":"POS279","CashierID":"OAS964","CustomerType":"PRIME","CustomerCardNo":"2262471989","TotalAmount":3196.0,"NumberOfItems":1,"PaymentMethod":"CASH","TaxableAmount":3196.0,"CGST":79.9,"SGST":79.9,"CESS":3.995,"DeliveryType":"HOME-DELIVERY","DeliveryAddress":{"AddressLine":"855-4409 Duis Street","City":"Junagadh","State":"Gujarat","PinCode":"622745","ContactNumber":"6984835508"},"InvoiceLineItems":[{"ItemCode":"518","ItemDescription":"Hourglass","ItemPrice":1598.0,"ItemQty":2,"TotalValue":3196.0}]}
{"InvoiceNumber":"1056169","CreatedTime":1667125036639,"StoreID":"STR2629","PosID":"POS285","CashierID":"OAS882","CustomerType":"NONPRIME","CustomerCardNo":"6419885098","TotalAmount":4728.0,"NumberOfItems":2,"PaymentMethod":"CASH","TaxableAmount":4728.0,"CGST":118.2,"SGST":118.2,"CESS":5.91,"DeliveryType":"TAKEAWAY","InvoiceLineItems":[{"ItemCode":"343","ItemDescription":"Massage chair","ItemPrice":1354.0,"ItemQty":1,"TotalValue":1354.0},{"ItemCode":"258","ItemDescription":"Closet","ItemPrice":1687.0,"ItemQty":2,"TotalValue":3374.0}]}

```

```sh
@Prateeks-MacBook-Pro scripts % /bin/zsh /Users/prats/Documents/Prateek/Apache-Kafka---Real-time-Stream-Processing-Master-Class-/09-pos-validator/scripts/2.invalid-pos-consumer.sh

```

<img width="1213" alt="Screenshot 2022-11-03 at 11 51 44 AM" src="https://user-images.githubusercontent.com/54174687/199658581-38f4d9ef-0589-4dea-8b26-32e8cc964cd5.png">




