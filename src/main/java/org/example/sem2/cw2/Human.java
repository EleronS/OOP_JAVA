package org.example.sem2.cw2;

public class Human extends Actor{


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;

    }

    @Override
    public void setTakeOrder() {
        takeOrder = true;

    }
}
