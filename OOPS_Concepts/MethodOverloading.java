public class MethodOverloading {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

//    Problem : no static in main
//    A static method cannot call a non-static method directly, because no object exists yet.
    public void main(String[] args) {
        int s1 = sum(2, 5);
        int s2 = sum(2, 5, 7);
        System.out.println("Sum of 2 & 5 is: " + s1);
        System.out.println("Sum of 2 & 5 & 7 is: " + s2);
    }
}
