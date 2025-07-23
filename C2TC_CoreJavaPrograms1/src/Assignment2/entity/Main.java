package Assignment2.entity;

public class Main {
    public static void main(String[] args) {
        // Create Student object to trigger default constructor
        Student s = new Student();

        // Create Commission object
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
        emp.display();
    }
}
