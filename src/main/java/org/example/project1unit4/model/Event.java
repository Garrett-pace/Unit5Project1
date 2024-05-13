package org.example.project1unit4.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Project1Data")
public class Event {
    @Id
    private String EventTitle;

    private String EventContents;
}
