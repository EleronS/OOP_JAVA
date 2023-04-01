package org.example.sem1.hm;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

    HotDrinksMachine machine = new HotDrinksMachine();
    machine.addDrink(new HotTea("ice tea",0.2,22));
    machine.addDrink(new HotTea("cold tea",0.4,23));
    machine.addDrink(new HotTea("nice tea",0.3,24));
    machine.addDrink(new HotTea("hot tea",0.2,25));

    ArrayList list2 = machine.getProduct(25);
        System.out.println(list2);


    }
}
