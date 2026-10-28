public class Operators {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Value of x is " + x);
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(-a);
        System.out.println(+a);
        System.out.println(++a);

        // A comment line

        /*
        Multi Comment line exactly like C & C++
         */

        System.out.println(a++);
        System.out.println(~a);

        boolean flag = false;
        System.out.println(flag);

        float f = 3.14f;
        System.out.println(f);

        int ternaryResult = (a == 10) ? 0 : 1;
        System.out.println(ternaryResult);

//        (a == 5) ? System.out.println(5) : System.out.println("Not 5");       ERROR
    }
}
