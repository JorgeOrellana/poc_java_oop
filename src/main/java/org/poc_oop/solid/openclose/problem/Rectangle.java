package org.poc_oop.solid.openclose.problem;

public class Rectangle
{
    private int sideA;
    private int sideB;
    private String type;

    public Rectangle(int sideA, int sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.type = "rectangle";
    }

    public int getSideA()
    {
        return sideA;
    }

    public int getSideB()
    {
        return sideB;
    }

    public String getType()
    {
        return type;
    }
}
