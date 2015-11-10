package J13Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carolchen on 27/08/2015.
 */
public class BasicHashMaps {
    static HashMap<String, Boolean> map = new HashMap<>();
    public static void  main(String[] args) {
        //add an object in map
        map.put("Kenny", true);
        map.put("Joe", false);
        System.out.println(map.get("Kenny"));
        //check if a KEY is in map
        if(map.containsKey("Kenny")) System.out.println("Kenny is in the map!");
        //check if a value is in map
        if(map.containsValue(true)) System.out.println("there is true value!");
        //get all the keys
        for (String s: map.keySet()) {
            System.out.println(s);
        }
        //get all the values
        for (Boolean value: map.values()) {
            System.out.println(value);
        }
        //get all the entry
        for (Map.Entry kv: map.entrySet()) {
            System.out.println(kv);
        }
        //remove an object
        map.remove("Kenny");




    }

}
