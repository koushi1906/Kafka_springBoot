package com.koushi.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.koushi.kafka.payload.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
//	@KafkaListener(topics = "koushi", groupId = "myGroup")
	public void consumeMsg(String msg) {
		log.info(String.format("Consumig messaged from kousi topic:: %s", msg));
	}
	
	@KafkaListener(topics = "koushi", groupId = "myGroup")
	public void customerJsonMsg(Student student) {
		log.info(String.format("Consumig messaged from kousi topic:: %s", student.toString()));
	}
}
