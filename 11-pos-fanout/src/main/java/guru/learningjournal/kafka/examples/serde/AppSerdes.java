package guru.learningjournal.kafka.examples.serde;

import guru.learningjournal.kafka.examples.types.HadoopRecord;
import guru.learningjournal.kafka.examples.types.Notification;
import guru.learningjournal.kafka.examples.types.PosInvoice;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;

import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {

    static final class PosInvoiceSerde extends WrapperSerde<PosInvoice> {
        PosInvoiceSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<PosInvoice> PosInvoice() {
        PosInvoiceSerde serde = new PosInvoiceSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, PosInvoice.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    static final class NotificationSerde extends WrapperSerde<Notification> {
        NotificationSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<Notification> Notification() {
        NotificationSerde serde = new NotificationSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, Notification.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    static final class HadoopRecordSerde extends WrapperSerde<HadoopRecord> {
        HadoopRecordSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<HadoopRecord> HadoopRecord() {
        HadoopRecordSerde serde = new HadoopRecordSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, HadoopRecord.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }
}