package Classwork.Lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tovar {
    public static Scanner sc = new Scanner(System.in);
    public static Baza[] tmz = new Baza[150];
    public static Baza addBaza = new Baza();
    public static int count = 0;
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        uploadTmz();
        blog: {
            while(true) {
                try {
                    System.out.println("Command ");
                    String command = sc.nextLine().toUpperCase().trim();
                    switch(command) {
                        case "ДОБАВИТЬ ТОВАР":
                            addProduct();
                            saveTmz();
                            break;
                        case "ПРОДАН ТОВАР":
                            deleteProduct();
                            break;
                        case "ВЫВЕСТИ СПИСОК":
                            printProduct();
                            break;
                        case "ВЫХОД":
                            break blog;
                    }
                } catch (RuntimeException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private static void printProduct() {
        for (int i = 0; i < count; i++) {
            System.out.println(tmz[i].toString() + " ");
        }
    }

    private static void deleteProduct() {
        boolean is = true;
        System.out.println("Введите товар ");
        String deleteTovar = sc.nextLine();
        System.out.println("Количество ");
        int deleteKolvo = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            if(deleteTovar.equalsIgnoreCase(addBaza.name)) {
                if(addBaza.kolichestvo > deleteKolvo) {
                    addBaza.kolichestvo = addBaza.kolichestvo - deleteKolvo;
                } else {
                    tmz[i-1] = tmz[i];
                    tmz[i-1].id -= 1;
                    is = false;
                }
            }
        }
        if(is)
            count--;
        saveAllTmz();
    }

    public static void uploadTmz() {
        String pathToFile = "C:\\Users\\User\\IdeaProjects\\MegacomJava\\data\\Tmz";
        File file = new File(pathToFile);
        try {
            Scanner scTmz = new Scanner(file);
            while(scTmz.hasNextLine()) {
                addBaza.id = scTmz.nextInt();
                addBaza.name = scTmz.next();
                addBaza.company = scTmz.next();
                addBaza.srokGodnosti = scTmz.next();
                addBaza.kolichestvo = scTmz.nextInt();
                addBaza.prodaja = scTmz.nextInt();
                addBaza.zakup = scTmz.nextInt();
                sc.nextLine();
                tmz[count] = addBaza;
                count++;
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        System.out.println("Data upload");
    }
    public static void saveTmz() {
        String pathToFile = "C:\\Users\\User\\IdeaProjects\\MegacomJava\\data\\Tmz";
        File file = new File(pathToFile);
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(file, true));
            out.print(tmz[count-1].toSave());
            out.println();
            out.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
    public static void saveAllTmz() {
        String pathToFile = "C:\\Users\\User\\IdeaProjects\\MegacomJava\\data\\Tmz";
        File file = new File(pathToFile);
        try {
            PrintWriter out = new PrintWriter(file);
            for (int i = 0; i < count; i++) {
                out.println(tmz[i].toSave());
            }
            out.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
    private static void addProduct() {

        addBaza.id = count + 1;
        System.out.print("Name ");
        addBaza.name = sc.nextLine();
        System.out.print("Company ");
        addBaza.company = sc.nextLine();
        System.out.print("Srok godnosti ");
        addBaza.srokGodnosti = sc.nextLine();
        System.out.print("Kolichestvo ");
        addBaza.kolichestvo = sc.nextInt();
        System.out.print("Prodaja ");
        addBaza.prodaja = sc.nextInt();
        System.out.print("Zakup ");
        addBaza.zakup = sc.nextInt();
        tmz[count] = addBaza;
        count++;
    }
}
