class A extends Object{
    public A() {
        super();    // Every class in java extends the Object class, this class extends the Object class
        System.out.println("Constructor of A is Called.");
    }

    public A(int n) {
        super();
        System.out.println("A: " + n);
    }
}

class B extends A {
    public B() {
        super();    // Calling the costructor of super class, It calls automatically even if you don't write super keyword
        System.out.println("Constructor of B is Called.");
    }

    public B(int n) {
        this();     // this() will call the constructor of the same class
        
        // Constructor cannot have more than one explicit constructor call
        // super(n);
        
        System.out.println("B: " + n);
    }
}

public class ThisAndSuper {
    public static void main() {
        B b1 = new B();
        B b2 = new B(5);
    }
}
