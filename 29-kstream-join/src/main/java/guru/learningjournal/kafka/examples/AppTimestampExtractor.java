/*
 * Copyright (c) 2019. Prashant Kumar Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package guru.learningjournal.kafka.examples;

import guru.learningjournal.kafka.examples.types.PaymentConfirmation;
import guru.learningjournal.kafka.examples.types.PaymentRequest;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.streams.processor.TimestampExtractor;

import java.time.Instant;

public class AppTimestampExtractor {

    private static final class PaymentRequestTimeExtractor implements TimestampExtractor {

        @Override
        public long extract(ConsumerRecord<Object, Object> consumerRecord, long prevTime) {
            PaymentRequest record = (PaymentRequest) consumerRecord.value();
            long eventTime = Instant.parse(record.getCreatedTime()).toEpochMilli();
            return ((eventTime > 0) ? eventTime : prevTime);
        }
    }

    public static PaymentRequestTimeExtractor PaymentRequest() {
        return new PaymentRequestTimeExtractor();
    }

    private static final class PaymentConfirmationTimeExtractor implements TimestampExtractor {

        @Override
        public long extract(ConsumerRecord<Object, Object> consumerRecord, long prevTime) {
            PaymentConfirmation record = (PaymentConfirmation) consumerRecord.value();
            long eventTime = Instant.parse(record.getCreatedTime()).toEpochMilli();
            return ((eventTime > 0) ? eventTime : prevTime);
        }
    }

    public static PaymentConfirmationTimeExtractor PaymentConfirmation() {
        return new PaymentConfirmationTimeExtractor();
    }

}