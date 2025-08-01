package com.allergytracker.allergytracker.model;

public class FoodEvent {
    private String name;
    private long timeInBetween;
    private int id;

    public FoodEvent(String name, long timeInBetween){
        this.name = name;
        this.timeInBetween = timeInBetween;
    }
    public FoodEvent(String name, long timeInBetween, int id){
        this.name = name;
        this.timeInBetween = timeInBetween;
        this.id = id;
    }
    public FoodEvent withId(int id){
        this.id = id;
        return this;
    }

    public String getName(){
        return name;
    }
    public long getTimeInBetween(){
        return timeInBetween;
    }
    public int getId(){
        return id;
    }

}
