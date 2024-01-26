package com.koushi.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    public void sendMessage(String msg) {
        log.info(String.format("Sending message to koushi topic: %s", msg));
        kafkaTemplate.send("koushi", msg);
    }
}
