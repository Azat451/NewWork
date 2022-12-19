package Homework.Homework7;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа - ");
        int num = sc.nextInt();
//        #1
        while (num > 0) {
          System.out.print(num % 10);
            num /= 10;
        }
//       #2
        String a = "";
        while (num > 0){
            int reverse = num % 10;
            num /= 10;
            a += reverse;
            System.out.println("" + a);
        }
    }
}
