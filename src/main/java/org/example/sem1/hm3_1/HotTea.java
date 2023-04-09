package org.example.sem1.hm3_1;

public class HotTea extends HotDrink{

    public HotTea(String name, Double volume, Integer price) {
        super(name, volume, price);
    }

    @Override
    public String toString() {
        return "HotTea "+this.getName()+this.getVolume()+this.getPrice();
    }
}
