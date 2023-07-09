package com.example.demo.designpatterns.abstractfactory.model;

public class Motorcycle implements Vehicle {

    @Override
    public void drive() {

        System.out.println("drive motorcycle...");
    }

    @Override
    public void stop() {

        System.out.println("stop motrcycle...");
    }
}
