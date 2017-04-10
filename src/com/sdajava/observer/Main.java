package com.sdajava.observer;

public class Main {

    public static void main(String[] args) {


        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
        subject.setState(12);


    }
}
