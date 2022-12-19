package Classwork.Lesson21.Fruit;

public class Orange extends Fruit {
    private boolean hasBeans;

    public Orange(String name, boolean hasBeans) {
        super(name);
        this.hasBeans = hasBeans;
    }

    @Override
    public void eat() {
        System.out.println("Orange : Make in juice");
    }
}
