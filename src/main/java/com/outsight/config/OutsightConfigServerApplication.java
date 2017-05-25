package com.outsight.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OutsightConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutsightConfigServerApplication.class, args);
	}
}
