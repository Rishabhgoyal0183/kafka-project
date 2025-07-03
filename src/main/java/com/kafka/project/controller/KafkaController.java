package com.kafka.project.controller;

import com.kafka.project.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaService kafkaService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        return kafkaService.sendMessage(message);
    }
}
