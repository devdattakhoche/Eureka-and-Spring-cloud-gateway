package com.Eureka_server.CLoud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CLoudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CLoudGatewayApplication.class, args);
	}

}
