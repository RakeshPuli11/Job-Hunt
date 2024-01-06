package com.REST.RESTmongo.controller;

import com.REST.RESTmongo.model.JobPost;
import com.REST.RESTmongo.repository.SearchRepository;
import com.REST.RESTmongo.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobhunt")
@CrossOrigin(origins = "http://localhost:3000")
public class JobPostController {

    @Autowired
    private JobPostService service;

    @Autowired
    private SearchRepository sr;

    @GetMapping("/all")
    @CrossOrigin
    public List<JobPost> getAllPosts(){
        return service.getAllPosts();
    }

    @PostMapping("/postjob")
    @CrossOrigin
    public String postAJob(@RequestBody JobPost jp){
        boolean x = service.postAJob(jp);
        if (x==true)
        return "done";
        else return "error";
    }
    @GetMapping("jobposts/{text}")
    @CrossOrigin
    public List<JobPost> search(@PathVariable String text){

        return sr.findByText(text);
    }
}
