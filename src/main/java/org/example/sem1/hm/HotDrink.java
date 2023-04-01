package org.example.sem1.hm;

import java.util.ArrayList;

public class HotDrink extends HotDrinksMachine {

    private String name;
    private Double volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }


    public HotDrink(String name, Double volume) {
        super();
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
