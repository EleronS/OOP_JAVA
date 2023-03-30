package org.example.sem3.cw1;

import java.util.Iterator;
import java.util.List;

public class CatIterator implements Iterator<Cat> {

    private int counter;

    private List<Cat> cats;

    public CatIterator( List<Cat> cats){
        this.counter = 0;
        this.cats = cats;
    }

    public CatIterator(int counter) {
        this.counter = counter;
    }

    @Override
    public boolean hasNext() {
        return counter < cats.size();
    }

    @Override
    public Cat next() {
        if(!hasNext()) {
            return null;

        }
        return cats.get(counter++);
    }
}
