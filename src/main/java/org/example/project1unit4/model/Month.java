package org.example.project1unit4.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@Document(collection = "Project1Data")
public class Month {
    @Id
    private String id;
    private String Month;
    private ArrayList<Day> Days;
}
