package com.example.consumermicroservice.consumer;

import com.example.consumermicroservice.model.Event;
import com.example.consumermicroservice.model.PackageProcessor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = {"X"}, groupId = "fst")
    public void receiveObject(Object object){
        //System.out.println(object);
        System.out.println(object.toString());
    }
}
