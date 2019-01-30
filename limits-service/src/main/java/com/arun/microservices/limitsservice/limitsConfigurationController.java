package com.arun.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class limitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsConfiguration( ) {
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
