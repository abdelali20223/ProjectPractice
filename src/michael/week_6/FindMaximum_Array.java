package michael.week_6;

import java.util.Arrays;

public class FindMaximum_Array {

    /*
     * Write a method that can find the maximum number from an int Array
     * */

    public static void main(String[] args) {

        int[] arr={34, 23, 45, 67,1};

        int maxNumber_1 = maxValue_1(arr);
        System.out.println("maxNumber_1 = " + maxNumber_1);

        int maxNumber_2 = maxValue_2(arr);
        System.out.println("maxNumber_2 = " + maxNumber_2);

    }


    public static int maxValue_1(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each > max)
                max = each;

        return max;


    }

    public static int maxValue_2( int[]  n ) {
        Arrays.sort( n );
        return  n[n.length-1];
    }

}