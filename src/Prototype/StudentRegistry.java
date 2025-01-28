package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String,Student> mp = new HashMap<>();
     void register(String key, Student st){
        mp.put(key,st);
    }

    Student get(String key){
        return mp.get(key);
    }
}
