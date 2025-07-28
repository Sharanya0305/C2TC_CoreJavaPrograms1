package abstractexample;

public class Executor {
	public static void main (String[] args) {
		Coder c1;
		
		//Student Obejct
		c1 = new Student();
		c1.rules();
		
		//Trainer Object
		c1 = new Trainer();
		c1.rules();
		
	}

}
