package Classwork.Lesson23.Animal;

import Classwork.Lesson23.ActionAnimal.Run;
import Classwork.Lesson23.ActionAnimal.Swim;

public class Dog  extends Animal implements Swim, Run {
    private String nameDog;

    public Dog(String name, int age, double weight, String nameDog) {
        super(name, age, weight);
        this.nameDog = nameDog;
    }

    public Dog() {
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    @Override
    public void run() {
        System.out.println(name + " " + nameDog + " " + run);
    }

    @Override
    public void swim() {
        System.out.println(name + " " + nameDog + " " + swim);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", nameDog='" + nameDog + '\'' +
                '}';
    }
}
