package michael.week_4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    /*
    * Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
    */

    public static void main(String[] args) {
        String removeDup_1 = removeDup_1("AAAaBBBCccccDD");
        System.out.println("removeDup_1 = " + removeDup_1);

        String removeDup_2 = removeDup_2("AAAaBBBCccccDD");
        System.out.println("removeDup_2 = " + removeDup_2);
    }

    public static  String  removeDup_1( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }

    public static String removeDup_2(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }


}
