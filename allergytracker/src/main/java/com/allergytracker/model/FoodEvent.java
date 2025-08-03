package com.allergytracker.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class FoodEvent {
    private String name;
    @JsonFormat()
    private LocalDateTime time;
    private int id;

    public FoodEvent(){
    }
    public FoodEvent(String name, LocalDateTime time){
        this.name = name;
        this.time = time;
    }
    public FoodEvent(String name, LocalDateTime time, int id){
        this.name = name;
        this.time = time;
        this.id = id;
    }
    public FoodEvent withId(int id){
        this.id = id;
        return this;
    }

    public String getName(){
        return name;
    }
    public LocalDateTime getTime(){
        return time;
    }
    public int getId(){
        return id;
    }

}
