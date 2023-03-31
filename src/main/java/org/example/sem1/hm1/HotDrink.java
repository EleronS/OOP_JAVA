package org.example.sem1.hm1;

public class HotDrink extends HotDrinksMachine{

    private int name;
    private int volume;

    public HotDrink(int name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + name +
                ", volume=" + volume +
                '}';
    }
}
