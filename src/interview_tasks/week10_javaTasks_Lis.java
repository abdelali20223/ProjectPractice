package interview_tasks;

import java.util.ArrayList;
import java.util.Collections;

public class week10_javaTasks_Lis {

    public static void main(String[] args) {

        //with sort method

        ArrayList<Integer> list = new ArrayList<>();
        list.add(113);
        list.add(14);
        list.add(7);
        list.add(22);
        list.add(11);

        Collections.sort(list);
        System.out.println("Sorted Ascending Order" + list);

        //without a ready method
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                    //outer loop iterates from the beginning to the second to the last element of list
                    //inner loop iterates thru unsorted portion of list - elements that come after current index i - j is the comparison element
                    //condition checks if element at  index i is greater than element at  index j - if true elements are swapped
                    // this moves all smaller elements to the beginning of the list
                }

            }
        }
        System.out.println("sorted ascending" + list);

        //descending order
        //condition checks to see if i is less than j and swaps if so
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("sorted descending" + list);

    }


}
