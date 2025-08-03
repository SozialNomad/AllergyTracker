package com.allergytracker.service;

import com.allergytracker.model.FoodEvent;
import com.allergytracker.model.SymptomEvent;

import java.util.ArrayList;
import java.util.List;

public class EventService {
    private final List<FoodEvent> foodEvents = new ArrayList<>();
    private final List<SymptomEvent> symptomEvents = new ArrayList<>();

    public void addFoodEvent(FoodEvent event) {
        foodEvents.add(event);
    }

    public void addSymptomEvent(SymptomEvent event) {
        symptomEvents.add(event);
    }

    public List<FoodEvent> getFoodEvents() {
        return foodEvents;
    }

    public List<SymptomEvent> getSymptomEvents() {
        return symptomEvents;
    }
}
