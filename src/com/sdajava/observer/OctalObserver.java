package com.sdajava.observer;

/**
 * Created by lukas on 10.04.2017.
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println("Str to octal: " + Integer.toOctalString(subject.getState()));
    }
}
