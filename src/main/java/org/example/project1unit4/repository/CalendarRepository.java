package org.example.project1unit4.repository;

import org.example.project1unit4.model.Month;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalendarRepository extends MongoRepository<Month, String> {
}
