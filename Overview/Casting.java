public class Casting {
    public static void main(String args[]) {
//        Implicit Casting
        int x = 5;
        double a = x;
        long b = x;
        float c = x;

        float y = 1.3f;
        double d = y;

//        Explicit Casting
        int i1 = (int) 4.5;
        float f1 = (float) 4.5;

        double d1 = 4.5 + 3;
        System.out.println(d1);
    }
}
