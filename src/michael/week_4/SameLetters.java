package michael.week_4;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    /*
    Write a return method that checks if a string is built out of the same letters as another string.
            Ex:  same("abc",  "cab"); -> true
            same("abc",  "abb"); -> false
 */

    public static void main(String[] args) {
        boolean sameLetters_1 = sameLetters_1("abcs", "csab");
        System.out.println("sameLetters_1 = " + sameLetters_1);


        boolean sameLetters_2 = sameLetters_2("abcs", "csab");
        System.out.println("sameLetters_2 = " + sameLetters_2);
    }

    public static boolean sameLetters_1(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[]  ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="", a2="";
        for(char each: ch1)
            a1 +=each;

        for(char each: ch2)
            a2 +=each;

        return  a1.equals(a2) ;
    }
    public static boolean sameLetters_2(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );
        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
        return  str1.equals(str2);
    }


}
