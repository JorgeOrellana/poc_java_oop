package org.poc_oop.solid.openclose.problem;


public class Square
{
    private int side;
    private String type;

    public Square(int side)
    {
        this.side = side;
        this.type = "square";
    }

    public int getSide()
    {
        return side;
    }
}
