package org.example.sem2.cw2;

public abstract class Actor implements ActorBeheveir{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;
    public boolean isMakeOrder(){
        return makeOrder;
    }
    public boolean isTakeOrder(){
        return takeOrder;
    }
    public abstract String getName();

}
