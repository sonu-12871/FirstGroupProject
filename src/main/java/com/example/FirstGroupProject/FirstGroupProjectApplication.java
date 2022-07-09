package com.example.FirstGroupProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class FirstGroupProjectApplication {

	//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
	public static void main(String[] args) {
		SpringApplication.run(FirstGroupProjectApplication.class, args);
	}

}
