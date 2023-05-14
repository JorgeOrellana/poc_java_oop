package org.poc_oop;

import org.poc_oop.car.AbstractVehicle;
import org.poc_oop.car.Car;
import org.poc_oop.car.IVehicle;
import org.poc_oop.car.Motorcycle;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        AbstractVehicle car = new Car();

        car.run();

        IVehicle vehicle = new Motorcycle();

        vehicle.stop();
    }
}