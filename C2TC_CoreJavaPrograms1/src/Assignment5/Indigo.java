package Assignment5;

public class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return hours * costPerHour * 8;
    }

    public void display() {
        System.out.println("Indigo: " + calculateAmount());
    }
}