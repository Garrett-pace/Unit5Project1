package org.example.project1unit4.controller;

import org.example.project1unit4.model.Day;
import org.example.project1unit4.model.Month;
import org.example.project1unit4.repository.CalendarRepository;
import org.example.project1unit4.repository.DayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class ProjectController {

    @Autowired
    private CalendarRepository calendarRepository;
    private DayRepo dayRepo;

    @GetMapping("/Months")
    public List<Month> getAllMonths() {
        return calendarRepository.findAll();
    }

    @GetMapping("/Months/{id}")
    public Month getMonth(@PathVariable String id){
        return calendarRepository.findById(id).orElse(null);
    }

    @GetMapping("/Months/{id}/Days/{id2}")
    public Day getDays(@PathVariable String id, @PathVariable String id2){
                  calendarRepository.findById(id).orElse(null);
               return dayRepo.findById(id2).orElse(null);
    }

}
