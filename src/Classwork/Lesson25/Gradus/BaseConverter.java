package Classwork.Lesson25.Gradus;

import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
//        convert(sc.nextDouble());
    }
    public static void convert(double C){
        double kelvin = C + 273.15;
        double fahr = 1.8 * C * 32;
        System.out.println("Kelvin - " + kelvin);
        System.out.println("Fahr - " + fahr);
    }
}
