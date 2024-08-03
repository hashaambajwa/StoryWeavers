package com.gareeb.storyweavers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class StoryweaversApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoryweaversApplication.class, args);
	}

}
