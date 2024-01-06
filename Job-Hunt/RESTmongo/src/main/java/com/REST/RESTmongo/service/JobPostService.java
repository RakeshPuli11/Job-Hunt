package com.REST.RESTmongo.service;

import com.REST.RESTmongo.model.JobPost;
import com.REST.RESTmongo.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService{

    @Autowired
    private JobPostRepository repo;

    public List<JobPost> getAllPosts() {
        return repo.findAll();
    }

    public boolean postAJob(JobPost jp) {
         repo.save(jp);
        return true;
    }
}
