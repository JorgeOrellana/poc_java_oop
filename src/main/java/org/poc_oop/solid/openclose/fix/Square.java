package org.poc_oop.solid.openclose.fix;

public class Square implements Shape
{
    private int side;

    public Square(int side)
    {
        this.side = side;
    }
    @Override
    public Integer getArea()
    {
        return side * side;
    }
}
