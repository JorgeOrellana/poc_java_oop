package org.poc_oop.solid;

import java.util.ArrayList;
import java.util.List;

public class Single
{
    private final String test;
    private final List<String> docs;

    public Single() {
        test = "Coco";
        docs = new ArrayList<>();
    }

    public void something()
    {
        docs.add("fdsafds");
    }

}
