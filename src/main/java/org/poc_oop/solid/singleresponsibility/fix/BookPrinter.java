package org.poc_oop.solid.singleresponsibility.fix;

public class BookPrinter
{
    public void printTextToConsole(String text)
    {
        System.out.println(text);
    }

    public void printTextToAnotherMedium(String text)
    {
        // Logic to print text
    }
}
