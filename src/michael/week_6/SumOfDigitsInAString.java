package michael.week_6;

public class SumOfDigitsInAString {
    /*
    * Write a method that can return the sum of the digits in a string
    * */

    public static void main(String[] args) {
        int sumOfDigits = sumOfDigits("Adsad57ndsal09bg34");
        System.out.println("sumOfDigits = " + sumOfDigits);
    }

    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

}
