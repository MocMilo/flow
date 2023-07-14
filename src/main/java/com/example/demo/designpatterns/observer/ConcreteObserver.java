package com.example.demo.designpatterns.observer;

public class ConcreteObserver implements Observer {

    private String name;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {

        String subjectState = concreteSubject.getState();
        System.out.println("Name:" + name + " subject was updated! New state:" + subjectState);
    }
}
