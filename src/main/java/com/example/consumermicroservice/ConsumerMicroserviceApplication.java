package com.example.consumermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ConsumerMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConsumerMicroserviceApplication.class, args);
	}

}
