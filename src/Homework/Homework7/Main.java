package Homework.Homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Задание 4
//        int n = 1;
//        for (int i = 1; i < n; i++ ){
//            for (int j = 0;j <= i;j++){
//                System.out.println(j);
//            }
//        }

// Задание 5
//        System.out.print("Введите сумму которую хотите накопить ? - ");
//        int num = sc.nextInt();
//        int number = 0;
////        #1
//        for (int i = 0; number <= num; i++){
//            System.out.print("Взнос - ");
//            number += sc.nextInt();
//            System.out.println("Ваша сумма " + number);
//            if (number >= num){
//                System.out.println("Поздравляем, вы накопили " + number);
//                break;
//            }
//        }
//        #2
//        while (number < num){
//            System.out.print("Взнос - ");
//            number += sc.nextInt();
//            System.out.println("Ваша сумма - " + number);
//            if (number >= num) {
//                System.out.println("Поздравляем, вы накопили " + number);
//                break;
//            }
//        }

// Задание 6
//        System.out.print("Введите числа - ");
//        int num = sc.nextInt();
//        #1
//        while (num > 0) {
//          System.out.print(num % 10);
//            num /= 10;
//        }

//  wrong task
//        int num = sc.nextInt();
//        String a = "";
//        while (num > 0){
//            int reverse = num % 10;
//            num /= 10;
//            a += reverse;
//            System.out.println("" + a);
//        }

//        #4
//        int number = sc.nextInt();
//        int reverse = 0;
//        for (;number != 0;number /= 10){
//            int digit = number % 10;
//            reverse = reverse * 10 + digit;
//            System.out.println(reverse);
//        }
//        System.out.println("Reverse number is " + reverse);
//
//        System.out.print("Enter the day of the month - ");
//        int seasonNumber = sc.nextInt();
////        int winter = 1, spring = 2, summer = 3, fall = 4; Сделать так чтобы в во время года открывались месяца и недели
//        String season = switch (seasonNumber) {
//            case 1 -> "Winter";
//            case 2 -> "Spring";
//            case 3 -> "Summer";
//            case 4 -> "Fall";
//            default -> "Wrong season";
//        };
//        System.out.println(season);
    }
}
