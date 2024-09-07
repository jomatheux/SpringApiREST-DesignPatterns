package com.jomatheux.ApiRestDesignPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiRestDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestDesignPatternsApplication.class, args);
	}

}
