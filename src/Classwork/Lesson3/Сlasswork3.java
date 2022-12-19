package Classwork.Lesson3;

import java.util.Scanner;

public class Сlasswork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Зарплата: ");
//        int salary = sc.nextInt();
//        System.out.print("Оклад: ");
//        int casing = sc.nextInt();
//        System.out.print("Календарные дни: ");
//        int CD = sc.nextInt();
//        System.out.print("Количесто обработанных дней: ");
//        int PD = sc.nextInt();
//        System.out.print("Премия: ");
//        int bonus = sc.nextInt();
//        System.out.print("Налог: ");
//        int duty = sc.nextInt();
//        System.out.print("Штрафы: ");
//        int forfeit = sc.nextInt();
//        int result = casing/CD * PD + bonus - duty - forfeit;
//        System.out.println(result);



        System.out.print("Введите охват по бюст - ");
        double K = sc.nextDouble();
        System.out.print("Введите по бедрам - ");
        double M = sc.nextDouble();
        System.out.print("Введите охват по талий - ");
        double N = sc.nextDouble();
        System.out.print("Введите рост - ");
        double T = sc.nextDouble();
        System.out.print("Введите вес - ");
        double P = sc.nextDouble();
        double LandResult = (K * M * T) / (Math.pow(N,N) / P);
        System.out.println(LandResult);


//        double A = sc.nextDouble();
//        System.out.println("Введите сумму кредита - ");
//        double K_sum_credit = sc.nextDouble();
//        System.out.println("Введите прцентную вставку - ");
//        double П_процент_вставка = sc.nextDouble();
//        System.out.println("Введите количества месяцев - ");
//        double M_кол_месяцев = sc.nextDouble();

    }
}
