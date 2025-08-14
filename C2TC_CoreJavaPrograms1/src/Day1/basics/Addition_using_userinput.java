package Day1.basics;

import java.util.Scanner;

public class Addition_using_userinput {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a:");
		 a = sc.nextInt();
		 System.out.println("Enter value b:");
		 b = sc.nextInt();
		 c = a+b;
		System.out.println("Addition of a and b is " + c);
	}

}