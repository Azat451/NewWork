package Classwork.Lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();

//        for (int i = 0;i <= 100;i += 2){ Четная числа(упращенный метод) - i += 2;
//            if (i % 2 == 0){             Четные числа не упращенный метод
//                System.out.println(i);
//            }
//            System.out.println(i);
//        }
//        for (int i = 1000;i >= 0;i--/**i-=2*/){ Не четная числа(упращенный метод) - i -= 2;
//            System.out.println(i);              Не четные числа не упращенный метод
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }
        int count = 1;
//        while (count > 0){                Цикл while
//            System.out.println(count);
//            count--;
//        }
//        do {                              Цикл do while
//           count++;
//           if (count % 2 == 0){
//               System.out.println(count);
//           }
//        }while (count < 100);

//        for (int i = 0;i < 10;i++){
//            if (i == 5)
//                continue; пропускает значение     continue
//                break; закнчивает цикл            break;
//            System.out.println(i);
//        }
        int a = 0;
//        while (a < 100){
//            a++;
//            System.out.println(a + ".ASD");
//            if (a == 50){
//                continue;
//            }
//        }
       for (int i = 1;i < 10;i++) {
           int randomNuber = (int) (Math.random() * 10); //Без класса Рандома, на целлочисленное класс Math.random не работает
           //один тип привести к другому: int имя = (int - тип присваивания)(Math.random() * 10;
           // double имя = Math.random;
           System.out.println(randomNuber);
       }
    }

    /**
     * Цикл -  это точное повторение одного и того же действия раз за разом в надежде на изменение.
     * Цикл - повторяет дейсвтие пока условие не закончится;
     * while,do while,for
     * while(цикл) - это while(условие - num < 10 когда должна остановоиться){
     * действие цикла System.out.println
     * и итерация - переменная count++;
     * }
     * do while = сначала делает потом проверяет
     * do{
     *     дейсвтие цикла
     *     Вывод цикла на терминал
     *     итерация
     * }while(условие цикла);
     * for
     * */
}
