package com.example.demo.model.designpatterns.abstractfactory.model;

public class Car implements Vehicle {
    @Override
    public void drive() {

        System.out.println("drive a car...");
    }

    @Override
    public void stop() {
        System.out.println("stop car...");
    }
}
