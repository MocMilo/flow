package com.example.demo.model.designpatterns.factorymethod;

import com.example.demo.model.designpatterns.factory.model.Motorcycle;
import com.example.demo.model.designpatterns.factory.model.Vehicle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {

        return new Motorcycle();
    }
}
