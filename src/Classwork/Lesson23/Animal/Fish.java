package Classwork.Lesson23.Animal;

import Classwork.Lesson23.ActionAnimal.Swim;

public class Fish extends Animal implements Swim {

    private String nameFish;

    public Fish(String name, int age, double weight, String nameFish) {
        super(name, age, weight);
        this.nameFish = nameFish;
    }

    public Fish(){}

    public String getNameFish() {
        return nameFish;
    }

    public void setNameFish(String nameFish) {
        this.nameFish = nameFish;
    }

    @Override
    public void swim() {
        System.out.println(name +" "+ nameFish +" "+ swim);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", nameFish='" + nameFish + '\'' +
                '}';
    }
}
