package Classwork.Lesson23;

import Classwork.Lesson23.ActionAnimal.Run;
import Classwork.Lesson23.Animal.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(),new Dog(),new Duck(),new Fish()};
        
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Run){
                runAnimal((Run) animals[i]);
            }
        }
    }
    private static void runAnimal(Run animal){
        animal.run();
    }
}
