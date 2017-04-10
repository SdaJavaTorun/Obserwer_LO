package com.sdajava.observer;

/**
 * Created by lukas on 10.04.2017.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println("Str to bin:" + Integer.toBinaryString(subject.getState()));
    }
}
