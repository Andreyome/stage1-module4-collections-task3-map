package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
if(functionMap.containsValue(requiredValue)){
    return true;
}
return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map <Integer, Integer> result = new HashMap<>();
        int tmp= 0;
        for(int i = 0; i < sourceList.size();i++) {
            tmp = sourceList.get(i);
            result.put(tmp, (tmp * 5) + 2);
        }
        return result;
    }
}
