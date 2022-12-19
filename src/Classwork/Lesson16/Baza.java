package Classwork.Lesson16;

public class Baza {
    int id;
    String name;
    String company;
    String srokGodnosti;
    int kolichestvo;
    int prodaja;
    int zakup;


    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", srokGodnosti=" + srokGodnosti +
                ",  kolichestvo='" + kolichestvo + '\'' +
                ", prodaja='" + prodaja + '\'' +
                ", zakup='" + zakup;
    }

    public String toSave() {
        String space = "                     ";
        return id + space + name + space +
                company + space +
                srokGodnosti + space + kolichestvo
                + space + prodaja + space +
                zakup;
    }
}
