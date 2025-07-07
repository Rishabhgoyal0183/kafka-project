package com.kafka.project.service.impl;

import com.kafka.project.producer.MessageProducer;
import com.kafka.project.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaServiceImpl implements KafkaService {

    private final MessageProducer messageProducer;

    @Value("${spring.kafka.topic.name}")
    private String topic;

    @Override
    public String sendMessage(String message) {
        for (int i = 1; i <= 100; i++) {
            messageProducer.sendMessage(topic, message + " " + i);
        }
        return "Messages sent successfully. ";
    }
}
