package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
Map <String, Integer> result = new HashMap<>();
//for (int i = 0; i<sourceMap.size();i++){
        for(Integer key: sourceMap.keySet()){
            if(result.containsKey(sourceMap.get(key))){
                if(key<result.get(sourceMap.get(key))){
                    result.put(sourceMap.get(key),key);
                }
            }
            else{
                result.put(sourceMap.get(key),key);
            }
        }
        return result;
    }
}
