package Classwork.Lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson13 {
    public static Object[][] customers = new String[15][5];
    public static Scanner scan = new Scanner(System.in);
    public static int count = 0;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        boolean isCont = true;
        while (isCont) {
            try {
                System.out.print("COMMAND: ");
                String cmd = scan.nextLine().toUpperCase().trim();
//                String command = readCommand(cmd);
                switch (readCommand(cmd)) {
                    case "REGISTER":
                        register();
                        saveData();
                        break;
                    case "COUNT":
                        System.out.println("Количество клиентов: " + count);
                        break;
                    case "PRINT":
                        print();
                        break;
                    case "EXIT":
//                        saveData();
                        isCont = false;
                        break;
                }
            } catch (RuntimeException exception) {
                exception.printStackTrace();
                System.out.println();
            }
        }
    }

    public static void saveData() {
        String pathToFile = "D:\\Users\\nrysbaev\\IdeaProjects\\Test\\data\\info.txt";
        File file = new File(pathToFile);

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(file, true));
            for (int j = 0; j < customers[count - 1].length; j++) {
                out.printf("%25s", customers[count - 1][j]);
            }
            out.println();
            out.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public static String readCommand(String command) {
        switch (command) {
            case "REGISTER":
            case "COUNT":
            case "PRINT":
            case "EXIT":
                return command;
            default:
                throw new RuntimeException();
        }

    }

    public static void print() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < customers[i].length; j++) {
                System.out.print(customers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void register() {
        System.out.print("Name: ");
        customers[count][0] = scan.nextLine();

        System.out.print("Surname: ");
        customers[count][1] = scan.nextLine();

        System.out.print("Birthday: ");
        customers[count][2] = scan.nextLine();

        System.out.print("Email: ");
        customers[count][3] = scan.nextLine();

        System.out.print("Phone: ");
        customers[count][4] = scan.nextLine();

        count++;
    }
}
