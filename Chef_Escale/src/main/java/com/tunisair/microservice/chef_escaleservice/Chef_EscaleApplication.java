package com.tunisair.microservice.chef_escaleservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class Chef_EscaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chef_EscaleApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(ChefEscaleRepository repository) {
	        return args -> {
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
