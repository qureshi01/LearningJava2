package Sample1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>(); //default size is 16
        map.put(100,200);
        map.put(400,800);
        map.put(600,1200);

        map.remove(400);

        if (map.containsKey(400)){
            int value = map.get(400);
            System.out.println(value);
        }else{
            System.out.println("key not found");
        }

        System.out.println(map.get(100));

        //Here the map is stored in m1 and it cannot be modified
        Map<Integer, Integer> m1 = Collections.unmodifiableMap(map);
        Map<Integer, Integer> m2 = Collections.synchronizedMap(map); //if multiple threads are approaching this is yhe way of conversion of synchronised



    }
}
