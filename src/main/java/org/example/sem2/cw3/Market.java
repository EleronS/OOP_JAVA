package org.example.sem2.cw3;

import org.example.sem2.cw2.Actor;
import org.example.sem2.cw2.Human;

import java.util.*;

public class Market implements QueeuBeheveir, MarketBeheveir{
    List<Human> myList = new ArrayList<>();
    Queue<Human> qList = new LinkedList<>();

    @Override
    public void acceptToMarket(Human human) {
        myList.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        myList.remove(human);
    }



    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human human) {
        qList.add(human);

    }


    @Override
    public void takeOrders() {
        qList.peek().setTakeOrder();

    }

    @Override
    public void giveOrders() {
        qList.peek().setMakeOrder();

    }

    @Override
    public void releaseFromQueue() {
        qList.poll();

    }
}
