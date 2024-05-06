package org.example.project1unit4.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collation = "Project1Data")
public class CalendarPost {
    @Id
    private String id;
    private String 
    private String EventTitle;
    private String EventContent;
}
