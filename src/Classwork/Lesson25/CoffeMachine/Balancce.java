package Classwork.Lesson25.CoffeMachine;

import java.time.LocalDateTime;

public class Balancce {
    private double saldoStart;
    private double sum;
    private double sumOrder;
    private double saldoEnd;
    private LocalDateTime localDateTime;

    public Balancce(double saldoStart, double sum, double sumOrder, double saldoEnd, LocalDateTime localDateTime) {
        this.saldoStart = saldoStart;
        this.sum = sum;
        this.sumOrder = sumOrder;
        this.saldoEnd = saldoEnd;
        this.localDateTime = localDateTime;
    }

    public Balancce() {
    }

    public double getSaldoStart() {
        return saldoStart;
    }

    public void setSaldoStart(double saldoStart) {
        this.saldoStart = saldoStart;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(double sumOrder) {
        this.sumOrder = sumOrder;
    }

    public double getSaldoEnd() {
        return saldoEnd;
    }

    public void setSaldoEnd(double saldoEnd) {
        this.saldoEnd = saldoEnd;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Balancce{" +
                "saldoStart=" + saldoStart +
                ", sum=" + sum +
                ", sumOrder=" + sumOrder +
                ", saldoEnd=" + saldoEnd +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
