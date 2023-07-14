package com.example.demo.designpatterns.observer;

public class Execute {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject("ABC");

        ConcreteObserver concreteObserver1 = new ConcreteObserver("Observer_1", concreteSubject);
        ConcreteObserver concreteObserver2 = new ConcreteObserver("Observer_2", concreteSubject);

        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);

        // change state
        concreteSubject.setState("XYZ");
        concreteSubject.detach(concreteObserver2);
        concreteSubject.setState("YYY");
    }
}
