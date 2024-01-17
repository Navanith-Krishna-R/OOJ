
import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
    public Subject() {
        this.credits = 0;
        this.subjectMarks = 0;
        this.grade = 0;
    }
}
class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject[] subjects;
    Student() {
        int i;
        subjects = new Subject[9];
        for (i = 0; i < 9; i++)
            subjects[i] = new Subject();
        s = new Scanner(System.in);
    }
    public void getStudentDetails() {
        System.out.print("Enter Name: ");
        name = s.next();
        System.out.print("Enter USN: ");
        usn = s.next();
    }

    public void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjects[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subjects[i].credits = s.nextInt();
            if (subjects[i].subjectMarks >= 90) {
                subjects[i].grade = 10;
            } else if (subjects[i].subjectMarks >= 80) {
                subjects[i].grade = 9;
            } else if (subjects[i].subjectMarks >= 70) {
                subjects[i].grade = 8;
            } else if (subjects[i].subjectMarks >= 60) {
                subjects[i].grade = 7;
            } else if (subjects[i].subjectMarks >= 50) {
                subjects[i].grade = 6;
            } else if (subjects[i].subjectMarks >= 40) {
                subjects[i].grade = 5;
            } else {
                subjects[i].grade = 0;
            }
        }
    }
    public void computeSGPA() {
        double totalCredits = 0.0;
        double weightedSum = 0.0;

        for (int i = 0; i < 8; i++) {
            totalCredits += subjects[i].credits;
            weightedSum += subjects[i].grade * subjects[i].credits;
        }
        SGPA = weightedSum / totalCredits;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("USN: " + s1.usn);
        System.out.println("SGPA: " + s1.SGPA);
    }
}