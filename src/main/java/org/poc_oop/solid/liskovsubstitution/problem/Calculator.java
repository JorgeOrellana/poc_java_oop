package org.poc_oop.solid.liskovsubstitution.problem;

public class Calculator
{
    public void printArea()
    {
        Rectangle rectangle = new Rectangle(6,7);
        System.out.println(rectangle.getArea());

        rectangle = new Square(6, 7);
        System.out.println(rectangle.getArea());
    }

    public static void main (String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.printArea();
    }
}
