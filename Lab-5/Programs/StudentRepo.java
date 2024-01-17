import java.util.Arrays;
import java.util.Scanner;

class StudentRepo{
    private int registrationNumber;
    private String fullName;
    private short semester;
    private float cgpa;
    public Student() {
        // Default values
        registrationNumber = 0;
        fullName = "";
        semester = 0;
        cgpa = 0.0f;
    }
    public Student(int regNumber, String name, short sem, float cgpa) {
        this.registrationNumber = regNumber;
        this.fullName = name;
        this.semester = sem;
        this.cgpa = cgpa;
    }
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
    public float getCGPA() {
        return cgpa;
    }
    public String getFullName() {
        return fullName;
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        inputStudentRecords(students);
        System.out.println("Original Student Records:");
        displayStudentRecords(students);
        sortByCGPA(students);
        System.out.println("Student Records Sorted by CGPA:");
        displayStudentRecords(students);
        sortByName(students);
        System.out.println("Student Records Sorted by Name:");
        displayStudentRecords(students);
    }
    private static void inputStudentRecords(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Full Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            short sem = scanner.nextShort();
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            students[i] = new Student(regNumber, name, sem, cgpa);
        }
    }
    private static void displayStudentRecords(Student[] students) {
        for (Student student : students) {
            student.display();
        }
    }
    private static void sortByCGPA(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Float.compare(s2.getCGPA(), s1.getCGPA()));
    }
    private static void sortByName(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getFullName().compareToIgnoreCase(s2.getFullName()));
    }
}
