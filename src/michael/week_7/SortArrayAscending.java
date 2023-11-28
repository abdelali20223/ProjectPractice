package michael.week_7;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayAscending {

    /*
    * Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        int[] sortedArrayAsc_1 = sort_1(arr);
        System.out.println("sortedArray_1 = " + Arrays.toString(sortedArrayAsc_1));



    }

    public static int[] sort_1(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);

        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }




}
