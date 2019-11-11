package com.tunisair.microservice.piloteservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableEurekaClient
public class PiloteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiloteApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(PiloteRepository repository) {
	        return args -> {
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
