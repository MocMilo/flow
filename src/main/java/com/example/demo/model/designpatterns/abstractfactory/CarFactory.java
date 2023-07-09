package com.example.demo.model.designpatterns.abstractfactory;

import com.example.demo.model.designpatterns.abstractfactory.model.Car;
import com.example.demo.model.designpatterns.abstractfactory.model.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
