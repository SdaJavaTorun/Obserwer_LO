package com.sdajava.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lukas on 10.04.2017.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;


    public int getState() {
        return state;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        refreshObservers();

    }

    public void refreshObservers(){
        observers.forEach(o -> o.update());
    }
}
