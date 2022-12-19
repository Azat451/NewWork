package Classwork.Lesson4;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько километров вы прошли - ");
        double sumKM = sc.nextDouble();
        System.out.print("Сколько литров вы потратили - ");
        double sum_LPetrol = sc.nextDouble();
        System.out.print("Сколько литров за это заплатили - ");
        double sum_PricePetrol = sc.nextDouble();

        double resultKm =(sum_LPetrol*sum_PricePetrol) / sumKM ;
        boolean difference = resultKm <= 10;
        System.out.println("Столько у вас литров нету " + resultKm + "\n" + difference);
    }
}
