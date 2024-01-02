abstract class AbsArea {
    int a, b;

    AbsArea(int x) {
        a = x;
    }

    AbsArea(int x, int y) {
        a = x;
        b = y;
    }

    abstract void area();
}

class rec extends AbsArea {
    rec(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("The area of the rectangle is: " + a * b);
    }
}

class tri extends AbsArea {
    tri(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("The area of the triangle is: " + (a * b) / 2);
    }
}

class cir extends AbsArea {
    cir(int a) {
        super(a);
    }

    void area() {
        System.out.println("The area of the circle is: " + 3.14 * a * a);
    }
}

class Main {
    public static void main(String args[]) {
        AbsArea r = new rec(3, 4);
        r.area();

        AbsArea t = new tri(4, 5);
        t.area();

        AbsArea c = new cir(2); // Provide a radius value
        c.area();
    }
}