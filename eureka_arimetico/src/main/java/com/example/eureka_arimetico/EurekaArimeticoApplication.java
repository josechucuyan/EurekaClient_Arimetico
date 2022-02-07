package com.example.eureka_arimetico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class EurekaArimeticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaArimeticoApplication.class, args);
	}

}
