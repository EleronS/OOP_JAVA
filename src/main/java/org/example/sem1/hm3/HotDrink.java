package org.example.sem1.hm3;

import java.util.Iterator;
import java.util.List;

public class HotDrink implements Iterable<HotTea>{
    private List<HotTea> drink;

    public HotDrink(List<HotTea> drink){
        this.drink = drink;
    }
    public int getSize(){
        int size = drink.size();
        return size;
    }


    @Override
    public Iterator<HotTea> iterator() {
        return new DrinkIterator(drink);
    }
}
