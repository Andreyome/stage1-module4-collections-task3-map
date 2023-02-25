package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence=sentence.toLowerCase();
        Map<String, Integer> result = new HashMap<>();
        if(sentence.length()<1){
            return result;
        }
        String[] tmp = sentence.replaceAll("\\W"," ").split(" ");
        for (int i = 0; i< tmp.length; i++) {
String word = tmp[i];
            if (result.containsKey(word)){
            result.put(word,(result.get(word)+1));
            }
            if(!result.containsKey(word)&&word.length()>0){
            result.put(word,1);
            }
        }
        return result;
    }
}
