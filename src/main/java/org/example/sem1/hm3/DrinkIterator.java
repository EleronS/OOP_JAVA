package org.example.sem1.hm3;

import java.util.Iterator;
import java.util.List;

public class DrinkIterator implements Iterator<HotTea> {
    private int counter;
    private List<HotTea> drink;

    public DrinkIterator(List<HotTea> drink) {
        this.counter = 0;
        this.drink = drink;
    }

    @Override
    public boolean hasNext() {
        return counter < drink.size();
    }

    @Override
    public HotTea next() {
        if(!hasNext()){
            return null;
        }
        return drink.get(counter++);
    }

}
