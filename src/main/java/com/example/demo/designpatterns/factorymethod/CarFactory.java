package com.example.demo.designpatterns.factorymethod;

import com.example.demo.designpatterns.factory.model.Car;
import com.example.demo.designpatterns.factory.model.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
