package com.example.demo.designpatterns.abstractfactory;

import com.example.demo.designpatterns.abstractfactory.model.Vehicle;

public class Execute {

    /**
     * To summarize, the Factory Method pattern focuses on creating a single type of product
     * through a hierarchy of creator classes, while the Abstract Factory pattern (HERE) focuses on creating families
     * of related products through a set of factory methods defined in an interface or abstract class.
     * TODO: review this example, because seem not to be representative for demo...?
     */
    public static void main(String[] args) {

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();
        car.stop();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.drive();
        motorcycle.stop();
    }
}
