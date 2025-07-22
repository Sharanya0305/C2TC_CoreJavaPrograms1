package EntityClassAssignment2;

public class MainProduct {
	 public static void main(String[] args) {
	        Product p1 = new Product(1, "Laptop", 60000.0);
	        Product p2 = new Product(2, "Mobile", 25000.0);
	        Product p3 = new Product(3, "Headphones", 2000.0);
	        Product p4 = new Product(4, "Monitor", 8000.0);

	        System.out.println("Product Details:");
	        p1.display();
	        p2.display();
	        p3.display();
	        p4.display();
	    }
	}


