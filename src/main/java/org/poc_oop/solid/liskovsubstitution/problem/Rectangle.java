package org.poc_oop.solid.liskovsubstitution.problem;

public class Rectangle
{
    private int width;
    private int height;

    public int getWidth()
    {
        return width;
    }

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getArea()
    {
        return width * height;
    }
}
