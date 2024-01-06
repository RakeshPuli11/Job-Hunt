//package com.REST.RESTmongo;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.EnableMongoAuditing;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//@Configuration
//@EnableMongoRepositories(basePackages = "com.REST.RESTmongo.repository")
//@EnableMongoAuditing
//public class MongoConfig {
//
//    @Bean
//    public MongoClient mongoClient() {
//        ConnectionString connectionString = new ConnectionString("connection string pettandi cloud dhi");
//        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .build();
//
//        return MongoClients.create(mongoClientSettings);
//    }
//}
//
//
//you cn using this when you don't want to use seervice or repository annotations
