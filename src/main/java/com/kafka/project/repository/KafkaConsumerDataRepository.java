package com.kafka.project.repository;

import com.kafka.project.entity.KafkaConsumerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaConsumerDataRepository extends JpaRepository<KafkaConsumerData, Long> {
}
