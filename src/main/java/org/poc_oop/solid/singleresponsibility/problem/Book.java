package org.poc_oop.solid.singleresponsibility.problem;

public class Book
{
    private String name;
    private String author;
    private String text;

    public String replaceWordInText(String word, String  replacementWord)
    {
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word)
    {
        return text.contains(word);
    }

    public void printTextToConsole()
    {
        System.out.println(text);
    }

    public void printTextToAnotherMedium()
    {
        // Logic to print text to another medium
    }
}
