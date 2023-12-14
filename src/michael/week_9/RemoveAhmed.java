package michael.week_9;

import java.util.*;

public class RemoveAhmed {
    public static void main(String[] args) {
        System.out.println("2nd Method");
        removeAhmed_1();
        System.out.println("2nd Method");
        removeAhmed_2();
        System.out.println("3rd Method");
        removeAhmed_3();
    }

    public static void removeAhmed_1(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
                names.removeAll( Arrays.asList("Ahmed"));

        System.out.println(names);
    }


    public static void removeAhmed_2(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        for(ListIterator<String> it = names.listIterator(); it.hasNext();)
            if(it.next().equals("Ahmed"))
                it.remove();

        System.out.println(names);

    }

    public static void removeAhmed_3(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
                Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names );

    }

}
