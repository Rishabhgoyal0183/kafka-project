package com.kafka.project.controller;

import com.kafka.project.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaService kafkaService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        return kafkaService.sendMessage(message);
    }
}
