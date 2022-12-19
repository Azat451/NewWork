package Classwork.Lesson25.CoffeMachine;

public class CoffeMachine {
    private double milk;
    private int water;
    private double sugar;
    private double coffebeans;

    public CoffeMachine(double milk, int water, double sugar, double coffebeans) {
        this.milk = milk;
        this.water = water;
        this.sugar = sugar;
        this.coffebeans = coffebeans;
    }

    public CoffeMachine() {
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCoffebeans() {
        return coffebeans;
    }

    public void setCoffebeans(double coffebeans) {
        this.coffebeans = coffebeans;
    }

    @Override
    public String toString() {
        return "CoffeMachine{" +
                "milk=" + milk +
                ", water=" + water +
                ", sugar=" + sugar +
                ", coffebeans=" + coffebeans +
                '}';
    }
}
