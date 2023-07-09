package com.example.demo.designpatterns.abstractfactory;

import com.example.demo.designpatterns.abstractfactory.model.Car;
import com.example.demo.designpatterns.abstractfactory.model.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
