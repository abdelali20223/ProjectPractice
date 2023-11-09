package PracticePracticalQuestions;


import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,5,7,8,11,-9,0};
//remember we need to import arrays, then user tostring to print out the arrays
        System.out.println(Arrays.toString(ascendingNumber(arr)));
        System.out.println(Arrays.toString(descendingNumbers(arr)));



    }



    public static int[] ascendingNumber(int [] numbers){

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length-1; j++) {

                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }

            }

        }


        return numbers;

    }
    public static int[] descendingNumbers(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length-1; j++) {

                if(numbers[j]<numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }

            }

        }
        return numbers;
    }
}
