$KAFKA_HOME/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 3 --partitions 2 --topic shipment --config min.insync.replicas=2