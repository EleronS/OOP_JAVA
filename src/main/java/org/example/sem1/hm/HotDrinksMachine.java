package org.example.sem1.hm;

import java.util.ArrayList;

public class HotDrinksMachine implements VendingMachine {

    private ArrayList<HotTea> list;

    public HotDrinksMachine() {
        this.list = new ArrayList<>();
    }

    public void addDrink(HotTea newItem) {
        list.add(newItem);
    }


    public ArrayList<HotTea> getProduct(String searchName) {
        ArrayList<HotTea> res = new ArrayList<HotTea>();
        for (HotTea item : list) {
            if (item.getName().contains(searchName)) {
                res.add(item);
            }
        }
        return res;

    }

    public ArrayList<HotTea> getProduct(Double searchVolume) {
        ArrayList<HotTea> res = new ArrayList<HotTea>();
        for (HotTea item : list) {
            if (item.getVolume().equals(searchVolume)) {
                res.add(item);
            }
        }
        return res;
    }

    public ArrayList<HotTea> getProduct(Integer searchTemperature) {
        ArrayList<HotTea> res = new ArrayList<HotTea>();
        for (HotTea item : list) {
            if (item.getTemperature().equals(searchTemperature)) {
                res.add(item);
            }
        }
        return res;
    }

}
