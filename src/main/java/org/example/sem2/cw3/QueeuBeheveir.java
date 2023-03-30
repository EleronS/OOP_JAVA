package org.example.sem2.cw3;

import org.example.sem2.cw2.Actor;
import org.example.sem2.cw2.Human;

public interface QueeuBeheveir {
    public void takeInQueue(Human human);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
