package com.Eureka_server.Second_Service.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/c")
public class Second_contorller {

	@HystrixCommand(fallbackMethod="fallback_hello",commandProperties = {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "2000")
	})
	@GetMapping("/")
	public String test() throws InterruptedException {
		Thread.sleep(3000);
		return "Second Service";
	}
	
	private String fallback_hello() {
		return "FallAbcasjn hello";
	}
	
}
