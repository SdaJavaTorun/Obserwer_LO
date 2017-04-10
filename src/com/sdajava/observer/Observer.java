package com.sdajava.observer;

/**
 * Created by lukas on 10.04.2017.
 */
public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
