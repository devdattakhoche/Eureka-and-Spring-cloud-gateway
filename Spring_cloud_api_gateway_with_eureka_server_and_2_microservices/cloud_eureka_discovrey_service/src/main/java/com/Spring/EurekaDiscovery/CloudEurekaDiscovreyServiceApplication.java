package com.Spring.EurekaDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaDiscovreyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaDiscovreyServiceApplication.class, args);
	}

}
