package com.Spring.EurekaDiscovery.SecondService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class SecondService {
	@GetMapping("/message")
	public String test()
	{
		return "Second Service";
	}

}
