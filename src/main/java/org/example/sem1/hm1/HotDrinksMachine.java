package org.example.sem1.hm1;

public class HotDrinksMachine implements VendingMachine {


    public HotDrinksMachine() {
    }

    public int getProduct(int name, int volume, int temperature) {

        return name & volume & temperature;
    }

    @Override
    public void getProduct() {

    }
}
