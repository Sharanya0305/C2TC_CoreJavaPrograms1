package abstractexample;

public abstract class Coder {
	protected static final String wakeup = "5 Am";
	
	// Abstract method declared
	abstract public void rules();
	
	// Concrete method
	public void show()
	{
		System.out.println("To Become a coder , Early morning practical needed");
	}

}
