package com.sdajava.observer;

/**
 * Created by lukas on 10.04.2017.
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println("Str hex: " + Integer.toHexString(subject.getState()));
    }
}
