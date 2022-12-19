package Classwork.Lesson16.NewClasswork_Inkapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        User user = new User();
        Manager manager = new Manager();
        Address address = new Address();
        System.out.println(manager);
    }
    //Ментор(name(surname,name,nextname),Курс,адресс),age,Id,зарплата),Студенты(name^,age,Ментор,Группа,Курс),
    // Курсы(Ментор,Группа,название Курса,Студенты),Группа(time,name,countStudent[],Курс,Метор,Студент),Общее место где учаться
}
