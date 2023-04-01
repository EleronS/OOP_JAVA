package org.example.sem1.hm;

public class HotTea extends HotDrink{
    private Integer temperature;

    public HotTea(String name, Double volume,Integer temperature) {
        super(name,volume);
        this.temperature = temperature;
    }

    public HotTea(String name, Double volume) {
        super(name, volume);
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
