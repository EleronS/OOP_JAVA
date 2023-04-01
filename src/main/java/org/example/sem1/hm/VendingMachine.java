package org.example.sem1.hm;

import java.util.ArrayList;

public interface VendingMachine {
    public void addDrink(HotTea newItem);
    public ArrayList<HotTea> getProduct(String searchName);
    public  ArrayList<HotTea> getProduct(Double searchVolume);
    public ArrayList<HotTea> getProduct(Integer searchTemperature);
}
