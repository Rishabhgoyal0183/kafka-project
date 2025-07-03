package com.kafka.project.consumer;

import com.kafka.project.entity.KafkaConsumerData;
import com.kafka.project.repository.KafkaConsumerDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageConsumer {

    private final KafkaConsumerDataRepository kafkaConsumerDataRepository;
    
    @KafkaListener(topics = "kafka-topic-2", groupId = "kafka-group-id-1")
    public void listen(String message, Acknowledgment acknowledgment) {

        KafkaConsumerData kafkaConsumerData = new KafkaConsumerData();
        kafkaConsumerData.setMessage(message);

        try {
            acknowledgment.acknowledge();
            kafkaConsumerData.setAcknowledge("Y");
        }catch (Exception exception){
            kafkaConsumerData.setAcknowledge("N");
        }
        kafkaConsumerDataRepository.save(kafkaConsumerData);
    }
}
