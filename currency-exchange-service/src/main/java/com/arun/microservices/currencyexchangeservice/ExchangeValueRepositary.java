package com.arun.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepositary extends JpaRepository<ExchangeValue, Integer>{
	
	//ExchangeValue findByFromAndTo(String from, String to);

	//ExchangeValue findByFromAndTo(String from, String to);

	ExchangeValue findByFromAndTo(String from, String to);

}
