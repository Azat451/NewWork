package Classwork.Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Classwork7 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите свое имя - ");
        String name = "Азат"; //sc.next();
        for (int i = 1; i < 10; i++) {
            System.out.println(name);
        }
        for (int i = 1;i < 100;i++){
            System.out.println(i);

        }
//
        for (int a = 1;a <= 10;a++){
            System.out.print("Напишите число - ");
            int num = sc.nextInt();
            int random = ran.nextInt(100);
            if (num != random){

            }
        }
    }
}
