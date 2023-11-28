package michael.week_5;

public class Reverse {
    /*
    * Write a return method that can reverse  String
        Ex: Reverse("ABCD"); ==> DCBA
*/

    public static void main(String[] args) {
        String reverse_a_string_1 = reverse_A_String_1("CYDEO");
        System.out.println("reverse_a_string_1 = " + reverse_a_string_1);

        String reverse_a_string_2 = reverse_A_String_2("JAVA");
        System.out.println("reverse_a_string_2 = " + reverse_a_string_2);
    }

    public static String reverse_A_String_1(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return  reverse;
    }

    public  static String  reverse_A_String_2(String str) {
        return new StringBuffer(str).reverse().toString();
    }


}
