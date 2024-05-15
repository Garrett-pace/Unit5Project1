package org.example.project1unit4.repository;

import org.example.project1unit4.model.Day;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DayRepo extends MongoRepository<Day, String> {
}