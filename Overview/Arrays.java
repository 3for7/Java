public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr[4]);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        2D Array
        int arr2[][] = new int[2][3];
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int arr3[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
