package com.example.demo.model.designpatterns.abstractfactory;

import com.example.demo.model.designpatterns.abstractfactory.model.Motorcycle;
import com.example.demo.model.designpatterns.abstractfactory.model.Vehicle;

public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
