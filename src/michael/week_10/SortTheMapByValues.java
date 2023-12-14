package michael.week_10;

import java.security.KeyStore;
import java.util.*;

public class SortTheMapByValues {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("F",1);
        map.put("D",2);
        map.put("C",3);
        map.put("B",6);
        map.put("E",9);
        map.put("A",7);

        sortByValue(map);
        System.out.println("map = " + map);

    }
    public static Map<String, Integer> sortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

}
