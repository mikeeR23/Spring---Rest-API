package com.example.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {EventmanagaementApiApplication.class, Jsr310Converters.class})
public class EventmanagaementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagaementApiApplication.class, args);
	}
}
