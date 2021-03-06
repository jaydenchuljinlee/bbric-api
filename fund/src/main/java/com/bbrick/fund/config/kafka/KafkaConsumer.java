package com.bbrick.fund.config.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "foo")
    public void consume(String message) throws IOException {
        System.out.printf("Consumed message : %s%n", message);
    }
}
