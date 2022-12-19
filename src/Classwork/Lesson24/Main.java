package Classwork.Lesson24;

import Classwork.Lesson23.Animal.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Integer a = Integer.parseInt("s");
//        testThrow();
        devideToZero();
        danceAnimal();
    }
    

    private static void danceAnimal() {
        Animal[] animals = {new Dog(),new Cat(),new Fish(),new Duck()};

        for (int i = 0; i < animals.length; i++) {
            try{
                if (animals[i] instanceof Cat){
                    throw new CatFoundexception();
                }
                System.out.println(animals[i].getClass() + " dancing");
            }catch (CatFoundexception e){
                e.printStackTrace();
            }
        }
    }

    private static void devideToZero() {
        try {
            int a = 3 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testThrow(){
        RuntimeException e = new ArithmeticException("Неправильное значение");
        System.out.println(e.getMessage());
    }

    private static void divideArray(){
        int[] array = new int[20];
        Arrays.fill(array,70);
        int[] divideNumbers = {2,4,0,6,0,7,3,2};
        for (int i = 0; i < array.length; i++) {
            try {
                int result = array[i] / divideNumbers[i];
                System.out.println(result);
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }catch (ArithmeticException e){
                e.printStackTrace();
                break;
            }
        }
    }
    private static void divideToCatchException(int[] array,int[] divideNumbers,int i){
        int result = array[i] / divideNumbers[i];
        System.out.println(result);
    }

}
