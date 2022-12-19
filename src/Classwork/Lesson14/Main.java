package Classwork.Lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    private static void multiplcationDouble(double v,double v1){
        double c = v * v1;
        System.out.println("Умножение " + c);
    }
    public static void multiplication(int f,int j){
        int c = f * j;
        System.out.printf("Умножение %d и %d = %d%n",f,j,c);
    }

    public static void multiplication(double f,double j) {
        double c = f * j;
        System.out.println("Умножение %,2f и %,2а");
    }
}
