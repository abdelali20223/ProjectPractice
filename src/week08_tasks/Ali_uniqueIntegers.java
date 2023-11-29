package week08_tasks;

import java.util.Arrays;

public class Ali_uniqueIntegers {

    public static void main(String[] args) {


            int N = 333;
            int[] resultArray = LastZeroArray(N);
            System.out.println(Arrays.toString(resultArray));


    }

    public static int[] LastZeroArray(int N) {

        int sum = 0;
        if (!(1 < N && N < 100)) {
            System.err.println("N should be between 1 and 99");
            System.exit(1);
        }

        int[] arr = new int[N];
        for (int i = 1; i < N; i++) {
            arr[i - 1] = i;
            sum+= i ;
        }

        arr[N - 1] = -sum ;

        return arr;
    }
}
