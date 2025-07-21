package Day1.entity;

public class CustomerDemo {
	public static void main (String[] args) {
		Customer c1 = new Customer();
		c1.cid =101;
		c1.cname = "Sharanya";
		c1.city = "Puducherry";
		System.out.println("Customer id:"+c1.cid);
		System.out.println("Customer Name:"+c1.cname);
		System.out.println("Customer City:"+c1.city);
		System.out.println();
		Customer c2 = new Customer();
		c2.cid =102;
		c2.cname = "Priya";
		c2.city = "Lawspet";
		System.out.println("Customer id:"+c2.cid);
		System.out.println("Customer Name:"+c2.cname);
		System.out.println("Customer City:"+c2.city);
	
	}
}
