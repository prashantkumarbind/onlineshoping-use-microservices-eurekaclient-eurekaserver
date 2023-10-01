package com.pksoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaServer
@EnableFeignClients
@SpringBootApplication
public class HandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingApplication.class, args);
		System.out.println("Spring Boot Starter*******************Handling*************");
		
	}
	
	@Bean
	 public RestTemplate getObject() {
		 
		    return new RestTemplate();
	 }

}
