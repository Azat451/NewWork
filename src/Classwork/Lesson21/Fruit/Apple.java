package Classwork.Lesson21.Fruit;

public class Apple extends Fruit {
    private boolean isLocal;

    public Apple(String name, boolean isLocal) {
        super(name);
        this.isLocal = isLocal;
    }

    @Override
    public void eat() {
        System.out.println("Apple : Make in jam");
    }
}
