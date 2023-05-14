package org.poc_oop.solid.dependencyinversion.problem;

public class Windows98Machine
{
    private final StandardKeyboard standardKeyboard;
    private final Monitor monitor;

    public Windows98Machine()
    {
        standardKeyboard = new StandardKeyboard();
        monitor = new Monitor();
    }
}
