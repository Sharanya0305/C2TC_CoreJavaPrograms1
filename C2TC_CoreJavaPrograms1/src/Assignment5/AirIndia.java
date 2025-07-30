package Assignment5;

public class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return hours * costPerHour;
    }

    public void display() {
        System.out.println("AirIndia: " + calculateAmount());
    }
}