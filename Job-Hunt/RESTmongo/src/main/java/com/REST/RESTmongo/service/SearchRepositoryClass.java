package com.REST.RESTmongo.service;

import com.REST.RESTmongo.model.JobPost;
import com.REST.RESTmongo.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.AggregateIterable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class SearchRepositoryClass implements SearchRepository {
    @Autowired
    private MongoClient mongoClient;

    @Autowired
    private MongoConverter converter;

    @Override
    public List<JobPost> findByText(String text) {
        List<JobPost> searchedPosts = new ArrayList<>();
        MongoDatabase database = mongoClient.getDatabase("restmongo");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("description", "workExperience", "profile", "techSkills")))),
                new Document("$sort",
                        new Document("field1", 1L)),
                new Document("$limit", 7L)));
        result.forEach(document -> searchedPosts.add(converter.read(JobPost.class, document)));
        return searchedPosts;
    }
}
