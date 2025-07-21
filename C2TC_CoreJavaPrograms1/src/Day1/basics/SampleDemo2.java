package Day1.basics;

public class SampleDemo2 {
	public static void main() {
		System.out.println("Welcome from main 1");
	}
	public static void main(char c[]) {
		System.out.println("Welcome from main 2");
	}
	public void main(String ar) {
		System.out.println("Welcome from main 3");
	}
	public static void main(String[]args) {
		System.out.println("Welcome");
		System.out.println("Next line");
	}
}
// Which main method will run? The main method with correct "Method signature" only will run.
// Method signature - Rules for Method syntax.