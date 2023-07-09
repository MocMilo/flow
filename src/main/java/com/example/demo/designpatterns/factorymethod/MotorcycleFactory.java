package com.example.demo.designpatterns.factorymethod;

import com.example.demo.designpatterns.factory.model.Vehicle;
import com.example.demo.designpatterns.factory.model.Motorcycle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {

        return new Motorcycle();
    }
}
