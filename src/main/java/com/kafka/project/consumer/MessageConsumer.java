package com.kafka.project.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "kafka-topic-2", groupId = "kafka-group-id-1")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
