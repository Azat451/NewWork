package Classwork.Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//
//         int result = number % 2;
//        System.out.println("Result" + result);
//
//        boolean system = (result > 0 || result < 0);

//       int ageMarry = 30;
//       int ageAibek = 28;
//
//       boolean isMarryOlder = ageMarry > ageAibek  ageMarry < 20;
//
//       System.out.println(isMarryOlder);

        int number = scan.nextInt();

        int result = number % 2;
        System.out.println("Result " + result);

        boolean isEven = !(result > 0 || result < 0);
//        boolean isEven = !(result != 0);
//        boolean isEven = result == 0;

        System.out.println(isEven);
    }
}
