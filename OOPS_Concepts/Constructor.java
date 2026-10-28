class A {
    int x;
    double y;

    public A(int x) {
        this.x = x;
        System.out.println("x: " + this.x);
    }

    public A(double y) {
        this.y = y;
        System.out.println("y: " + this.y);
    }
}

public class Constructor {
    public static void main() {
        A a1 = new A(5);
        A a2 = new A(6.7);
    }
}
