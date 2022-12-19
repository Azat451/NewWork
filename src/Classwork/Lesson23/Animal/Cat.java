package Classwork.Lesson23.Animal;

import Classwork.Lesson23.ActionAnimal.Run;

public class Cat extends Animal implements Run {
    private String nameCat;

    public Cat(String name, int age, double weight, String nameCat) {
        super(name, age, weight);
        this.nameCat = nameCat;
    }
    public Cat(){

    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    @Override
    public void run() {
        System.out.println(name +" "+nameCat+" "+  run);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", nameCat='" + nameCat + '\'' +
                '}';
    }
}
