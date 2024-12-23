public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();

        // Accepting details and displaying them
        student.acceptDetails();
        student.displayDetails();

        // Calculating and displaying SGPA
        double sgpa = student.calculateSGPA();
        System.out.println("\nSGPA: " + sgpa);
    }
}