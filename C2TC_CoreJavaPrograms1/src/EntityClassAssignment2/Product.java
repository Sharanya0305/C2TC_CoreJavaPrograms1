package EntityClassAssignment2;

public class Product {
	private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}