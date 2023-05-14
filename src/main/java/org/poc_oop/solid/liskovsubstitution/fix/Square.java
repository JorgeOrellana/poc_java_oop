package org.poc_oop.solid.liskovsubstitution.fix;

public class Square extends Shape
{
    private int side;

    public Square(int side)
    {
        this.side = side;
    }

    @Override
    public int getArea()
    {
        return side * side;
    }
}
