package interview_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class week9_javaTasks_Lis {
    public static void main(String[] args) {


        // 1. Concat 2 arrays
        int[] array1 = {10, 20, 30,};
        int[] array2 = {40, 50, 60};

        int[] concatArray = concatArrays(array1, array2);
        System.out.println("Concat array: " + Arrays.toString(concatArray));
        System.out.println("------------------------------------------------------------------------------");

    // 2.)  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //Write a java operation to remove all the names named Ahmed

        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Dave");
        names.add("Hayden");
        names.add("Ahmed");

        System.out.println("Original List: " + names);
        removeName(names, "Ahmed");
        System.out.println("List after removing 'Ahmed' :  " + names);
        System.out.println("----------------------------------------------------------------------------");

        // 3.) Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(101);
        numbers.add(74);
        numbers.add(174);
        numbers.add(14);
        numbers.add(11);

        System.out.println("Original List: " + numbers);
        removeGreaterThan100(numbers);
        System.out.println("List after removing values greater than 100: " + numbers);

    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] result = new int[length1 + length2];
        System.arraycopy(arr1, 0, result, 0, length1);
        System.arraycopy(arr2, 0, result, length1, length2);
        return result;
    }

    public static void removeName(List<String> names, String nameToRemove) {

        //use method removeIf to remove elements that match condition
        names.removeIf(name -> name.equals(nameToRemove));
    }

    public static void removeGreaterThan100(List<Integer> numbers){
        numbers.removeIf(number -> number > 100);
    }


}