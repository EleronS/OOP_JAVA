package org.example.sem3.cw2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();
        for ( int i = 0; i < 5; i++ ) {
            if(i%2==0){
                shelter.addAnimal(new Cat(i*2, i*3,"cat"+i));
            }
            else {
                shelter.addAnimal(new Dog(i*3, i*4,"dog"+i));
            }

        }
        shelter.print();
        AnimalComparator comparator = new AnimalComparator();
        List result = shelter.getAnimals();
        Collections.sort(result, comparator);
        System.out.println(result);
    }
}
