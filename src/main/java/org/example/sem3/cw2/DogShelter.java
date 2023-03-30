package org.example.sem3.cw2;

public class DogShelter extends Animal{
    public DogShelter(Integer age, Integer weight, String name) {
        super(age, weight, name);
    }

    @Override
    public String toString() {
        return "DogShelter" + this.getName() +" "+ this.getWeight();
    }
}
