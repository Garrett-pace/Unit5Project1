package org.example.project1unit4.controller;

import org.example.project1unit4.model.CalendarPost;
import org.example.project1unit4.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class ProjectController {

    @Autowired
    private CalendarRepository calendarRepository;

    @GetMapping("/Months")
    public List<CalendarPost> getAllMonths() {
        return calendarRepository.findAll();
    }
}
