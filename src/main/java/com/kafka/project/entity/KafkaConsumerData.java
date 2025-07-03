package com.kafka.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kafka_consumer_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaConsumerData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String message;

    @Column(nullable = false, length = 1)
    private String acknowledge;
}
