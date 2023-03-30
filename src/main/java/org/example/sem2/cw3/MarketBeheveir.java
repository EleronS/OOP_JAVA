package org.example.sem2.cw3;

import org.example.sem2.cw2.Actor;
import org.example.sem2.cw2.Human;

import java.util.List;

public interface MarketBeheveir {
    public void acceptToMarket(Human human);
    public void releaseFromMarket(Human human);
    public void update();
}
