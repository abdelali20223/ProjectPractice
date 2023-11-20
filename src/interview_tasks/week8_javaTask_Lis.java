package interview_tasks;

import java.util.Arrays;

public class week8_javaTask_Lis {

    public static void main(String[] args) {

        int [] array = {11,0,14,7,0,0,3};
        System.out.println(Arrays.toString(array));

        moveZerosToEnd(array);
        System.out.println(Arrays.toString(array));

     }
        public static void moveZerosToEnd(int[] arr){

        int nonZeroIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] !=0){
                    arr[nonZeroIndex]=arr[i];
                    if (i != nonZeroIndex){
                        arr[i] = 0;
                    }
                    nonZeroIndex++;
                }
            }
        }
            // using a loop to move all non-zero to the front of array

}
