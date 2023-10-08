package edu.desu.collections.partC;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public static Integer characterReplacement(String s, int k){
        int maxLen = 0;
        int left = 0; // Left pointer of the window
        int maxCount = 0; // Maximum count of a single character in the current window
        Map<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
            maxCount = Math.max(maxCount, charCount.get(rightChar));

            // Calculate the number of replacements needed in the current window
            int replacementsNeeded = (right - left + 1) - maxCount;

            // If replacements needed exceed k, move the left pointer
            if (replacementsNeeded > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                left++;
            }

            // Update the maximum length of the substring
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
