package com.REST.RESTmongo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "JobPost")
public class JobPost {
    @Id
    private String id;

    private String description;

    private int workExperience;

    private String profile;

    private List<String> techSkills;
}
