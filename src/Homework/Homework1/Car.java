package Homework.Homework1;

public class Car {
    public static void main(String[] args) {

        String brand = "BMW";
        String model = "Z8(E52)";
        String year_of_issue = "2000-2003";

        boolean brokenCar = false;
        boolean oldCar = true;
        String color = "#C0C0C0 - Светло Серая";
        byte doors = 5;
        int km = 310;
        double price = 50.000;
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
}
