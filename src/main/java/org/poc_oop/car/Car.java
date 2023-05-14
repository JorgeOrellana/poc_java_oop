package org.poc_oop.car;

public class Car extends AbstractVehicle
{
    @Override
    public void run()
    {
        System.out.println("car running");
    }

    public void runFast()
    {
        System.out.println("run fast");
    }
}
