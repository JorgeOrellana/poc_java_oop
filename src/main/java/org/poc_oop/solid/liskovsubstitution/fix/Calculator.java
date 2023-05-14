package org.poc_oop.solid.liskovsubstitution.fix;


public class Calculator
{
    public void printArea()
    {
        Shape rectangle = new Rectangle(6,7);
        System.out.println(rectangle.getArea());

        rectangle = new Square(6 );
        System.out.println(rectangle.getArea());
    }

    public static void main (String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.printArea();
    }
}
