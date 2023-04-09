package org.example.sem1.hm3;

public class HotTea {
    String name;
    Double volume;
    Integer temperature;

    public HotTea(String name,Double volume,Integer temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;

    }


    @Override
    public String toString() {
        return "HotTea{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
