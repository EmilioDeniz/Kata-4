package model;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Histogram<T> {
    private final Map<T,Integer> mapa = new HashMap<>();
    
    public Integer get(T key){
        return mapa.get(key);
    }
    
    public Set<T> keySet(){
        return mapa.keySet();
    }
    void increment(T key) {
        mapa.put(key, mapa.containsKey(key) ? mapa.get(key) +1 :1);
    }
}
