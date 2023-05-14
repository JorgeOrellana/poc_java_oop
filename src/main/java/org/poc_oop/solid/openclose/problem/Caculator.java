package org.poc_oop.solid.openclose.problem;

public class Caculator
{
    public void calculateArea()
    {
        Rectangle rec = new Rectangle(3,5);
        Square square = new Square(7);
        int area = 0;
        switch(rec.getType()) {
            case "rectangle": area = rec.getSideA() * rec.getSideB();
            case "square": area =  square.getSide() * square.getSide();
        }

        System.out.println(area);
    }
}
