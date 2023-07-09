package com.example.demo.designpatterns.factory.model;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("drive a car...");
    }
}
