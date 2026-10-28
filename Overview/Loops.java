public class Loops {
    public static void main(String[] args) {
//        while loop
        int i = 10;
        while(i > 0) {
            System.out.print(i + " ");
            i--;
        }

        System.out.print("\n");

//        for loop
        for(int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }

        System.out.print("\n");

//        do-while loop
        i++;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
    }
}
