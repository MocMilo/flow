package com.example.demo.model.designpatterns.factorymethod;

import com.example.demo.model.designpatterns.factory.model.Vehicle;

public abstract class VehicleFactory {

    // some factory method here:
    public abstract Vehicle createVehicle();

    public void someCommonOperation(){

        System.out.println("Performing common operations on the vehicle.");
    }
}
