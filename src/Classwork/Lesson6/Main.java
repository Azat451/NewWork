package Classwork.Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
//        int a = sc.nextInt();
//        if(a > 4){
//            System.out.println("A bigger then 4 ");
//        }else if(a == 4){
//            System.out.println("A equals to 4 ");
//        }else {
//            System.out.println("A smaller then 4");
//        }
//        if (a > 6){
//            System.out.println("A bigger then 6");
//        }

        int temperature = 9;
        if (temperature > 20){
            System.out.println("nadet runashku"); // Температура меньше 20
        }else if (temperature > 10)
            System.out.println("nadet sviter");// Температура меньше 10
        else if (temperature > 0)
            System.out.println("nadet plash");// Температура меньше 0
        else System.out.println("nadet palto");
    }
    /**
     * Ветвление — алгоритмическая конструкция, при выполнении которой в зависимости
     * от проверки условия («да» или «нет»), можно выбрать одну из двух последовательностей.
     * Алгоритмы с конструкцией «ветвление» называются разветвляющимися.
     *
     * if - Условный оператор реализует выполнение определённых команд при условии,
     * что некоторое логическое выражение (условие) принимает значение «истина» true . В большинстве языков программирования
     * условный оператор начинается с ключевого слова if (в переводе с англ. — «если»).
     * else -(англ иначе) условный оператор который выполняется после if,если условный оператор if принимает значение "true" то
     * else выполняет занечение "false"
     * Пример:
     * if(Выражение для выбора){
     *     значение
     * }else{
     *     if(Второе Выражение для выбора)
     *     значение
     * }
     *Параметр ВыражениеДляСравнения - выражение, в результате вычисления которого получается целое число (как правило).
     * Команда switch сравнивает результат ВыражениеДляСравнения с каждым последующим Совпадением. Если обнаруживается совпадение, то исполняется команда
     * или набор команд, которые прописаны за данным оператором. Если совпадений не будет, то исполняется команда после ключевого слова default.
     * Однако оператор default не является обязательным. В этом случае при отсутствии совпадений программа не выполняет никаких действий.
     * Каждая секция case обычно заканчивается командой break, которая передаёт управление к концу команды switch.
     * Порядок выполнения в операторе следующий:
     * Вычисляется ВыражениеДляВыбора. Далее оператор switch сравнивает полученное выражение с очередным Значением (в порядке перечисления).
     * Если ВыражениеДляВыбора совпало со Значением, то выполняется код, идущий после двоеточия.
     * Если встречается конструкция break — то управление передается за пределы команды switch.
     * Если совпадений ВыражениеДляВыбора и Значений не выявлено, то управление передаётся КодуВыбораПоУмолчанию.
     *
     * switch (ВыражениеДляВыбора) {
     *            case  (Значение1):
     *                Код1;
     *                break;
     *            case (Значение2):
     *                Код2;
     *                break;
     *
     *            case (ЗначениеN):
     *                КодN;
     *                break;
     *            default:
     *                КодВыбораПоУмолчанию;
     *                break;
     *        }
     */
}
