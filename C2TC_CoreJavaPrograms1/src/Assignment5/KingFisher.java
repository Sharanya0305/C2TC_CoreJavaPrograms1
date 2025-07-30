package Assignment5;

public class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return hours * costPerHour;
    }

    public void display() {
        System.out.println("KingFisher: " + calculateAmount());
    }
}
