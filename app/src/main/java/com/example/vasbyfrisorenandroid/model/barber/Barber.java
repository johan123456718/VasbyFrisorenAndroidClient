package com.example.vasbyfrisorenandroid.model.barber;

public class Barber {
    private String name;
    private boolean available;

    public Barber(){

    }

    public Barber(String name, boolean available){
        this.name = name;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }
}
