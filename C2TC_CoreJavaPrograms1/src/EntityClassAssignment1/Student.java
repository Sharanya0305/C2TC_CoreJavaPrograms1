package EntityClassAssignment1;

public class Student {
	  private int id;
	    private String name;
	    private String department;

	    public Student(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    public void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
	    }
	}


