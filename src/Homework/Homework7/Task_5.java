package Homework.Homework7;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму которую хотите накопить ? - ");
        int num = sc.nextInt();
        int number = 0;
////        #1
        for (int i = 0; number <= num; i++){
            System.out.print("Взнос - ");
            number += sc.nextInt();
            System.out.println("Ваша сумма " + number);
            if (number >= num){
                System.out.println("Поздравляем, вы накопили " + number);
                break;
            }
        }
//        #2
        while (number < num){
            System.out.print("Взнос - ");
            number += sc.nextInt();
            System.out.println("Ваша сумма - " + number);
            if (number >= num) {
                System.out.println("Поздравляем, вы накопили " + number);
                break;
            }
        }
    }
}
