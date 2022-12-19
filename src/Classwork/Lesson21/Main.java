package Classwork.Lesson21;

import Classwork.Lesson21.Animals.Animal;
import Classwork.Lesson21.Animals.Chicken;
import Classwork.Lesson21.Animals.Tiger;
import Classwork.Lesson21.Fruit.Apple;
import Classwork.Lesson21.Fruit.Fruit;
import Classwork.Lesson21.Fruit.Orange;

public class Main {
    public static void main(String[] args) {
    Animal[] animals = new Animal[2];
    animals[0] = new Chicken("Shashlik",4,"Broler");
    animals[1] = new Tiger("Kitir",45,12);

    Fruit[] fruits = new Fruit[2];
    fruits[0] = new Apple("Alma",true);
    fruits[1] = new Orange("Apelsin",false);


    printReceipt((Chicken)animals[0]);
    printReceipt(fruits[0]);
    printReceipt(fruits[1]);
    }

    public static void printReceipt(Eatable eatable){
        eatable.eat();
    }

}
