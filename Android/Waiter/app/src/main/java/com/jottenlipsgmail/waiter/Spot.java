package com.jottenlipsgmail.waiter;

/**
 * Created by John on 1/30/2016.
 */
public class Spot {

    public Spot(){
        this.name = "";
        this.waitTime = "";
        this.visitors = "";
    }

    public Spot (String name, String visitors, String waitTime)
    {
        this.name = name;
        this.waitTime = waitTime;
        this.visitors = visitors;
    }
}
