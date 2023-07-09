package com.example.demo.designpatterns.factory;

import com.example.demo.designpatterns.factory.model.Car;
import com.example.demo.designpatterns.factory.model.Vehicle;
import com.example.demo.designpatterns.factory.model.VehicleType;
import com.example.demo.designpatterns.factory.model.Motorcycle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    Map<VehicleType, Vehicle> knownVehicles = new HashMap<>();

    public VehicleFactory() {

        knownVehicles.put(VehicleType.CAR, new Car());
        knownVehicles.put(VehicleType.MOTORCYCLE, new Motorcycle());
    }

    Vehicle create(VehicleType vehicleType){

       return knownVehicles.get(vehicleType);
    }

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.create(VehicleType.CAR);
        vehicle.drive();

    }


}
