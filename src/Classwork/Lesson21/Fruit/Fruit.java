package Classwork.Lesson21.Fruit;

import Classwork.Lesson21.Eatable;

public abstract class Fruit implements Eatable {
    protected String name;

    public Fruit(String name) {
        this.name = name;
    }
}
