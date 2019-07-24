package com.itau.api.service.accounts.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.itau.api.controller"})
public class ItauApiAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItauApiAccountsApplication.class, args);
	}
	
}
