package Classwork.Lesson21.Animals;

import Classwork.Lesson21.Eatable;

public class Chicken extends Animal implements Eatable {
    private String type;

    public Chicken(String name, int weight, String type) {
        super(name, weight);
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("Chicken : make KFC");
    }
}
