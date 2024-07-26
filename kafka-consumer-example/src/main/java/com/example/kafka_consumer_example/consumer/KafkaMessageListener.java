package com.example.kafka_consumer_example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "java-kafka", groupId = "jk-group-1")
    public void consume(String message){
        logger.info("Message is consumed by the consumer {} " , message);
    }
}
