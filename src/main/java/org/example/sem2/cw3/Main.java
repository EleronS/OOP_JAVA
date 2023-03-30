package org.example.sem2.cw3;

import org.example.sem2.cw2.Actor;
import org.example.sem2.cw2.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);

    }
}
