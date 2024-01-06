package com.REST.RESTmongo.repository;

import com.REST.RESTmongo.model.JobPost;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface SearchRepository {
    List<JobPost> findByText(String text);
}
