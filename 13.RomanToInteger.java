import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        Scanner sc = new Scanner(System.in);
        int integer = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        for (int i = 0; i < s.length(); i++) {
            int ted = map.get(s.charAt(i));
            if (i+1 < s.length()) {
                int dalsiCislo = map.get(s.charAt(i + 1));
                if (ted >= dalsiCislo) {
                    integer += ted;
                }
                else {
                    integer -= ted;
                }
            }
            else {
                integer += ted;
            }
        }
        return integer;
    }
}