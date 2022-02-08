package com.viriyah.kafka.kafka.comsumer.consumer;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class kafkaConsumer {
    @KafkaListener(topics ="freewill" , groupId ="group_id")
    public  void  consume(String message){
      System.out.println("message = "+message);
    }
}
