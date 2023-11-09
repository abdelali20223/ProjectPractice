package PracticePracticalQuestions;

public class FindMinNumber {

    public static void main(String[] args) {

        int[]arr= {1,2,3,3,54,7,8,9};

        System.out.println(minimumNumber(arr));
        System.out.println(maxNumber(arr));

    }



    public static int minimumNumber(int[] number1){

        int min=number1[0];

        for (int each  : number1) {
            if(each<min){
                min=each;
            }
        }



        return min;

    }

    public static int maxNumber(int[] number1){

        int max=number1[0];

        for (int each  : number1) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
}
