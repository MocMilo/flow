package com.example.demo.model.designpatterns.factorymethod;

import com.example.demo.model.designpatterns.factory.model.Car;
import com.example.demo.model.designpatterns.factory.model.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
