//Program to demonstrate  break statement
package Day2.basics;

public class BreakDemo {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}

	}
}