package com.sr.stores_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StoresServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoresServiceApplication.class, args);
	}

}
