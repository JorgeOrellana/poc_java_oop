package org.poc_oop.solid.openclose.fix;

public class Rectangle implements Shape
{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Integer getArea() {
        return sideA * sideB;
    }
}
