package org.example.sem1.hm3_1;

import java.util.ArrayList;
import java.util.List;

public class Tea extends Drink{
    private static List<Drink> drinks;

    public Tea() {
        this.drinks = new ArrayList<>();
    }


    public void addDrink(Drink drink){
        drinks.add(drink);

    }
    public static void print() {
        for(Drink drink: drinks){
            System.out.println(drink);
        }
    }
}
