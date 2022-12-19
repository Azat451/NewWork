package Classwork.Lesson22;
public class Season {
    private String seasonName;

    private Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public static Season SPRING = new Season("Весна");

    public static Season SUMMER = new Season("Лето");

    public static Season AUTUMN = new Season("Осень");

    public static Season WINTER = new Season("Зима");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                '}';
    }
}