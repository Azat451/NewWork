package Classwork.Lesson23.Animal;

import Classwork.Lesson23.ActionAnimal.Fly;
import Classwork.Lesson23.ActionAnimal.Run;
import Classwork.Lesson23.ActionAnimal.Swim;

public class Duck extends Animal implements Fly, Run, Swim {
    private String nameDug;

    public Duck(String name, int age, double weight, String nameDug) {
        super(name, age, weight);
        this.nameDug = nameDug;
    }

    public Duck(){}

    public String getNameDug() {
        return nameDug;
    }

    public void setNameDug(String nameDug) {
        this.nameDug = nameDug;
    }

    @Override
    public void fly() {
        System.out.println(name + " " + nameDug + " " + fly);
    }

    @Override
    public void run() {
        System.out.println(name + " " + nameDug + " " + run);
    }

    @Override
    public void swim() {
        System.out.println(name + " "+ nameDug +" " + swim);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", nameDug='" + nameDug + '\'' +
                '}';
    }
}
