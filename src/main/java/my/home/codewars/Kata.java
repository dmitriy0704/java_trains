package my.home.codewars;

import java.util.Arrays;

public class Kata {
    public static int[] between(int a, int b) {
        int arrSize = 0;
        int[] arr = new int[0];
        if (a < b) {
            arrSize = b + 1 - a;
            arr = new int[arrSize];
            for (int i = 0, j = a; i < arrSize; i++, j++) {
                arr[i] = j;
            }
        }
        return arr;
    }

    public static void testing() {
        int[] res = between(-2, 2);
        System.out.println(Arrays.toString(res));
    }
}
