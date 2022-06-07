package task.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"một");
        map.put(2,"hai");
        map.put(3,"ba");
        System.out.println(map);
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        map.remove(2);
        System.out.println(map);
        map.replace(1,"một1");
        System.out.println(map);
    }
}
