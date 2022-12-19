package Classwork.Lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //массивы
        System.out.print("Enter the number masive ");
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array.length);
        }
    }
}
