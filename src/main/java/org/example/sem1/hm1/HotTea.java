package org.example.sem1.hm1;

public class HotTea extends HotDrink{
    private int temperature;

    public HotTea(int name, int volume) {
        super(name, volume);
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
