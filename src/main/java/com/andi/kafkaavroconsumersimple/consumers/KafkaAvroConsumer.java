package com.andi.kafkaavroconsumersimple.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.andi.Mmessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaAvroConsumer {

    @KafkaListener(topics = "${kafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
    void consume(Mmessage data) {
	log.info(data.toString());
    }

}
