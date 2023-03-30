package org.example.sem3.cw1;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("name")));
        Iterator<Cat>iterator = cats.iterator();
        cats.getSize();
        if(iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
}
