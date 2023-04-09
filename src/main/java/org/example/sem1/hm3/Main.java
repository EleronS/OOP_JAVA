package org.example.sem1.hm3;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink drink = new HotDrink(List.of(new HotTea("Lisma", 0.2, 75),
                new HotTea("Batik", 0.2, 80),
                new HotTea("Lipton", 0.250,80)));
        int size = drink.getSize();
        Iterator<HotTea>iterator = drink.iterator();
        for ( int i = 0; i < size; i++ ) {
            if (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
