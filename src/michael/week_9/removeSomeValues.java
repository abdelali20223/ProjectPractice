package michael.week_9;

import java.util.*;

public class removeSomeValues {
    /*
    *Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
    public static void main(String[] args) {
        System.out.println("Method_1");
        removeSomeValues_1();
        System.out.println("Method_2");
        removeSomeValues_2();
        System.out.println("Method_3");
        removeSomeValues_3();
        System.out.println("Method_4");
        removeSomeValues_4();

    }

    public static void removeSomeValues_1(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int  each : list1)
            if( each < 100)
                list2.add(each);

        list1=list2;
        System.out.println(list1);
    }

    public static void removeSomeValues_2(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            if(it.next()>100)
                it.remove();

        System.out.println(list);

    }

    public static void removeSomeValues_3(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        for(ListIterator<Integer> il = list.listIterator(); il.hasNext();)
            if(il.next()>100)
                il.remove();

        System.out.println(list);

    }
    public static void removeSomeValues_4(){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        list.removeIf(p -> p>100);
        System.out.println(list);

    }
}
