package edu.desu.collections.example;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public int countDuplicates(String data){
        int result = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i < data.length(); i++){
            char x = data.charAt(i);
            if(charCount.containsKey(x)){
                int count = charCount.get(x) + 1;
                charCount.put(x,count);
            }else {
                // If the character is not yet in our map, we initialize its count to 1.
                charCount.put(x, 1);
            }
            if(charCount.get(x) == 2){
                result++;
            }
        }
        return result;
    }

}
