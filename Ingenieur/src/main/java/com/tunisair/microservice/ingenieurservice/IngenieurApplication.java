package com.tunisair.microservice.ingenieurservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.tunisair.microservice.ingenieurservice.Ingenieur;
import com.tunisair.microservice.ingenieurservice.IngenieurRepository;

@SpringBootApplication
@EnableEurekaClient
public class IngenieurApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngenieurApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(IngenieurRepository repository) {
	        return args -> {
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
