package com.kafka.project.service;

import org.springframework.stereotype.Service;

@Service
public interface KafkaService {

    String sendMessage(String message);
}
