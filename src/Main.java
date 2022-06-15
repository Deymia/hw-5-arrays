public class Main {
    public static void main(String[] args) {

        int [] arr1 = new int[] {1, 2, 3};
        System.out.println(arr1 [0] + ", " + arr1 [1] + ", " + arr1 [2]);

        float [] arr2 = new float[] {1.57f, 7.654f, 9.986f};
        System.out.println(arr2 [0] + ", " + arr2 [1] + ", " + arr2 [2]);

        double [] arr3 = new double[] {3.3333333d, 4.4d, 5.55555d};
        System.out.println(arr3 [0] + ", " + arr3[1] + ", " + arr3[2]);

        // задание 3
        System.out.println(arr1 [2] + ", " + arr1 [1] + ", " + arr1 [0]);
        System.out.println(arr2 [2] + ", " + arr2 [1] + ", " + arr2 [0]);
        System.out.println(arr3 [2] + ", " + arr3 [1] + ", " + arr3 [0]);

        // задание 4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1 [i] % 2 != 0 ) {
                arr1[i]++;
            }
        }
        System.out.println(arr1 [0] + ", " + arr1 [1] + ", " + arr1 [2]);


    }
}