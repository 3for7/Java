class A {
    public void print() {
        System.out.println("Hello World!");
    }
}

class B extends A {
    public void print() {
        System.out.println("Hello Kishore!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.print();
        b1.print();

        A a2 = new B();
        a2.print();

        // B b2 = new A();      ERROR
        // b2.print();
    }
}
