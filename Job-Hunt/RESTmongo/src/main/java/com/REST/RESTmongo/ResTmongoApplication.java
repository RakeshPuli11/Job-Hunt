package com.REST.RESTmongo;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ResTmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTmongoApplication.class, args);
	}

}
