package michael.week_2;

public class SwapNumbers {
    public static void main(String[] args) {


        String numbersAfterSwap_1 = swappingNumbers_1(10, 20);
        System.out.println("Numbers After Swap_1: " + numbersAfterSwap_1);

        String numbersAfterSwap_2 = swappingNumbers_2(50, 70);
        System.out.println("Numbers After Swap_2: " + numbersAfterSwap_2);
    }

    public static String swappingNumbers_1(int a, int b){


        a = a +b;
        b = a - b;
        a = a - b;

        String aAndBAfterSwap= "\na= "+a + "\nb= "+b;

        return aAndBAfterSwap;
    }

    public static String swappingNumbers_2(int a, int b){

        a = a^b;
        b = a^b;
        a = a^b;

        String aAndBAfterSwap= "\na= "+a + "\nb= "+b;

        return aAndBAfterSwap;

    }

}
