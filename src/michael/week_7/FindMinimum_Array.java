package michael.week_7;

import java.util.Arrays;

public class FindMinimum_Array {
    /*
    * Write a method that can find the maximum number from an int Array
    * */

    public static void main(String[] args) {
        int[] arr={34, 23, 45, 67,1};

        int minNumber_1 = minValue_1(arr);
        System.out.println("minNumber_1 = " + minNumber_1);

       int minNumber_2 = minValue_2(arr);
       System.out.println("maxNumber_2 = " + minNumber_2);


    }

    public static int minValue_1( int[]  n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;

        return min;
    }

    public static int minValue_2( int[]  n ) {
        Arrays.sort( n );
        return  n [ 0 ];
    }


}
