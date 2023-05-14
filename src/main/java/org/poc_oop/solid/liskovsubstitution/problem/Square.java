package org.poc_oop.solid.liskovsubstitution.problem;

public class Square extends Rectangle
{
    public Square(int width, int height)
    {
        super(width, height);
    }

    @Override
    public int getArea()
    {
        return getWidth() * getWidth();
    }
}
