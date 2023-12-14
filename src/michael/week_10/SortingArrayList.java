package michael.week_10;

import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 8, 9, 56, 87, 24));

        sortingArrayListAsc(listOfNumbers);
        System.out.println("listOfNumbers after sorting ascending= " + listOfNumbers);

        sortingArrayListDesc(listOfNumbers);
        System.out.println("listOfNumbers after sorting descending= " + listOfNumbers);


    }

    public static void sortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void sortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }


}
