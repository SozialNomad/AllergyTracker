package com.allergytracker.controller;

import com.allergytracker.model.FoodEvent;
import com.allergytracker.model.SymptomEvent;
import com.allergytracker.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // --- Add a Food Event ---
    @PostMapping("/food")
    public void addFoodEvent(@RequestBody FoodEvent event) {
        eventService.addFoodEvent(event);
    }

    // --- Get all Food Events ---
    @GetMapping("/food")
    public List<FoodEvent> getFoodEvents() {
        return eventService.getFoodEvents();
    }

    // --- Add a Symptom Event ---
    @PostMapping("/symptom")
    public void addSymptomEvent(@RequestBody SymptomEvent event) {
        eventService.addSymptomEvent(event);
    }

    // --- Get all Symptom Events ---
    @GetMapping("/symptom")
    public List<SymptomEvent> getSymptomEvents() {
        return eventService.getSymptomEvents();
    }
}
