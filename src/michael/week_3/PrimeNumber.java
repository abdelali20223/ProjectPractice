package michael.week_3;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not
    */
    public static void main(String[] args) {

        boolean primeNumber = primeNumber(11);
        System.out.println("Is the number a Prime? ==> " + primeNumber);
    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }

}
