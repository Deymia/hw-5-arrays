public class Main {
    public static void main(String[] args) {

        int [] arr1 = new int[] {1, 2, 3};
        for (int i = 0; i< arr1.length; i++) {
            System.out.print(arr1 [i] + " ");
        }
        System.out.println();

        float [] arr2 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i< arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        double [] arr3 = new double[] {3.3333333, 4.4, 5.55555};
        for (int i = 0; i< arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        // задание 3
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1 [arr1.length - arr1[j]] + " ");
        }
        System.out.println();
        System.out.println(arr2 [2] + " " + arr2 [1] + " " + arr2 [0]);
        System.out.println(arr3 [2] + " " + arr3 [1] + " " + arr3 [0]);

        // задание 4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1 [i] % 2 != 0 ) {
                arr1[i]++;
            }
            System.out.print(arr1 [i] + " ");
        }



    }
}