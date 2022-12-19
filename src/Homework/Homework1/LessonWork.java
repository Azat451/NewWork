package Homework.Homework1;

public class LessonWork {
    public static void main(String[] args) {
        String name = "JavaBootCamp";
        int price = 16000;
        double months = 3.5;
        String nameTeacher = "Dolon Askarbekov";
        boolean start = true;
        String format = "Программирование офлайн";
        boolean employment = true;
        String languageProgramming = "Java";
        System.out.println("Название курсах - " + name
                + "\nСтоимость - " + price + " сом"
                + "\nДлительность в месяцах - " + months + " месяца"
                + "\nПреподаватель - " + nameTeacher
                + "\nНачат или нет - " + start + "-да"
                +"\nФормат - " + format
                +"\nЕсть ли трудоустройство? - " + employment + "-да"
                +"\nЯзык программирования - " + languageProgramming );
    }
}
