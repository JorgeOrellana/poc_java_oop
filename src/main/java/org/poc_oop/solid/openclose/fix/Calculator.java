package org.poc_oop.solid.openclose.fix;


public class Calculator
{
    public void calculateArea()
    {
        Shape rec = new Rectangle(3,5);
        Shape square = new Square(7);


        System.out.println(rec.getArea());
        System.out.println(square.getArea());
    }
}
