package com.example.demo.model.designpatterns.factorymethod;

import com.example.demo.model.designpatterns.factory.model.Vehicle;


/**
 * Here is example usage of 'factory method pattern'
 * Note that Factory class to create object is changed to some abstract VehicleCreator hierarchy
 * with child classes with creation object implementation.
 */
public class Execute {
    public static void main(String[] args) {

        VehicleFactory carCreator = new CarFactory();
        Vehicle car = carCreator.createVehicle();
        car.drive();
        carCreator.someCommonOperation();

        VehicleFactory motorcycleCreator = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleCreator.createVehicle();
        motorcycle.drive();
        motorcycleCreator.someCommonOperation();
    }
}
