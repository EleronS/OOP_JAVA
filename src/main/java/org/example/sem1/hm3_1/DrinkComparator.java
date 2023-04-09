package org.example.sem1.hm3_1;

import java.util.Comparator;

public class DrinkComparator implements Comparator<HotDrink> {
    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        return o1.getPrice().compareTo(o2.getPrice());


    }
}
