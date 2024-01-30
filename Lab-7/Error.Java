
import java.util.*;
class WrongAge extends Exception {
    WrongAge(String message) {
        super(message);
    }
}

class Father {
    int age;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        this.age = age;
    }
}


class Son extends Father {
    int sage;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age should be less than Father's age");
        }

        this.sage = sonAge;
    }
}

public class Error {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
        try {
   System.out.println("Enter the daddy's age: ");
   int a = sc.nextInt();
            Father father = new Father(a);
   System.out.println("Enter the sonny's age: ");
            int b = sc.nextInt();
            Son son = new Son(a, b);
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
