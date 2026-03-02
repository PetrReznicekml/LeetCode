import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        Map<Character, Integer> word = new HashMap<>();
        for (int left = 0, right = 0; right < s.length(); right++){
            if (word.containsKey(s.charAt(right)) && word.get(s.charAt(right)) >= left){
                left = word.get(s.charAt(right))+1;
            }
            output = Math.max(output, right - left + 1);
            word.put(s.charAt(right), right);
        }



        return output;
    }
}