public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Override toString() method
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("John", 20);
        System.out.println("Student details: " + student);
        String studentDetails = student.toString();
        System.out.println("Student details: " + studentDetails);
    }
}
