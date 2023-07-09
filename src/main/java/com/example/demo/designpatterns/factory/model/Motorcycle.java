package com.example.demo.designpatterns.factory.model;

public class Motorcycle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("drive motorcycle...");
    }
}
