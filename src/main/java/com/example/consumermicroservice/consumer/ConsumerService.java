package com.example.consumermicroservice.consumer;

import com.example.consumermicroservice.model.Client;
import com.example.consumermicroservice.model.Event;
import com.example.consumermicroservice.model.PackageBox;
import com.example.consumermicroservice.model.Package;
import com.example.consumermicroservice.model.PackageProcessor;
import com.example.consumermicroservice.repository.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

@Service
public class ConsumerService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PackageRepository packageRepository;
    @Autowired
    private PackageBoxRepository packageBoxRepository;
    @Autowired
    private PackageProcessorRepository packageProcessorRepository;

    @KafkaListener(topics = {"X"}, groupId = "fst")
    public void receiveObject(Object object) {
        ConsumerRecord<?, ?> record = (ConsumerRecord<?, ?>) object;
        Object value = record.value();

        // parse the JSON object into its corresponding class
        ObjectMapper mapper = new ObjectMapper();
        if (value instanceof LinkedHashMap) {
            LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) value;
            if (map.containsKey("clientId")) {
                Client client = mapper.convertValue(map, Client.class);
                client.setClientId(null);
                clientRepository.save(client);
            } else if (map.containsKey("eventId")) {
                Event event = mapper.convertValue(map, Event.class);
                event.setEventId(null);
                eventRepository.save(event);
            } else if (map.containsKey("packageId")) {
                Package packageObj = mapper.convertValue(map, Package.class);
                packageObj.setPackageId(null);
                packageRepository.save(packageObj);
            } else if (map.containsKey("boxId")) {
                PackageBox box = mapper.convertValue(map, PackageBox.class);
                box.setBoxId(null);
                packageBoxRepository.save(box);
            } else if (map.containsKey("processorId")) {
                PackageProcessor processor = mapper.convertValue(map, PackageProcessor.class);
                processor.setProcessorId(null);
                packageProcessorRepository.save(processor);
            }
        }
    }
}
