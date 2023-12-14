package michael.week_9;

import java.util.Arrays;

public class Concat2Arrays {
    public static void main(String[] args) {

        int [] arr1={1, 3, 5, 7, 9};
        int [] arr2={2, 4, 6, 8, 10};


        int[] result = concatTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }


        public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {
            int[] result = new int[arr1.length + arr2.length];
            int i = 0;
            for(int each: arr1) {
                result[i] = each;
                i++;
            }
            for(int each: arr2) {
                result[i] =each;
                i++;
            }
            return result;
        }


    }

