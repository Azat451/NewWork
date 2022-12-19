package Classwork.Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите марку автомобиля - ");
        String brand = sc.next();
        System.out.print("Введите модель автомобиля - ");
        String model = sc.next();
        System.out.print("Введите год выпуска автомобиля - ");
        String year_of_issue = sc.next();

        boolean brokenCar = false;
        boolean oldCar = true;
        System.out.print("Введите цвет машины - ");
        String color = sc.next();
        byte doors = sc.nextByte();
        System.out.print("Сколько км проезжает- ");
        int km = sc.nextInt();
        System.out.print("Ценна - ");
        double price = sc.nextDouble();
        System.out.println("Бренд автомобиля - " + brand +
                "\nМодель - " + model +
                "\nГод выпуска - " + year_of_issue +
                "\nБитая: " + brokenCar + "- не битая" +
                "\nСтарая: " + oldCar + "- старая" +
                "\nЦвет - " + color +
                "\nдвери - " + doors +
                "\nСкорость - " + km + " km" +
                "\nЦенна - " + price + " $");
    }
    /**
     * Scanner это класс в языке Java, который позволяет считывать данные из разных источников.
     * В том числе и с консоли.
     * С помощью класса java.util.Scanner можно анализировать простые типы данных и строки.
     * Этот класс принимает данные из файлов, потоков, строк, последовательностей символов или байтов.
     * Входные данные разбиваются на токены. По умолчанию разделителем токенов служит пробел, но его
     * можно заменить строкой (java.lang.String) или регулярным выражением (java.util.regex.Pattern).
     */
}
