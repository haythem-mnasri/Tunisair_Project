package com.tunisair.microservice.avionservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class AvionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvionApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(AvionRepository repository) {
	        return args -> {
	        	
	        	//Avion1 = new Avion("405FB", "5.0", (float) 400.0, 500);
	           
	              //  repository.save();
	           
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
