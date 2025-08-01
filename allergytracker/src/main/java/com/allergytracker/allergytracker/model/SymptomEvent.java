package com.allergytracker.allergytracker.model;

public class SymptomEvent {
    private String symptomName;
    private long timestamp;

    public SymptomEvent() {
    }

    public SymptomEvent(String symptomName, long timestamp) {
        this.symptomName = symptomName;
        this.timestamp = timestamp;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
