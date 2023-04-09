package org.example.sem1.hm3_1;

public class HotCoffee extends HotDrink{
    public HotCoffee(String name, Double volume, Integer price) {
        super(name, volume, price);
    }

    @Override
    public String toString() {
        return "HotCoffee "+this.getName()+this.getVolume()+this.getPrice();
    }
}
