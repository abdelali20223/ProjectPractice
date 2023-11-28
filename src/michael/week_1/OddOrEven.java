package michael.week_1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Number you provided is "+ identifyOddEven(5));
        System.out.println("Number you provided is "+identifyOddEven(6));
    }



    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "Odd" ;
    }

}
