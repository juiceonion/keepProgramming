package brute_force;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lc1781 {
    public int beautySum(String s) {
        int res = 0;
        Map<Character, Integer> map;

        int len = s.length();
        for (int i = 0; i < len; i++) {
            map = new HashMap<>();
            for (int j = i; j < len; j++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                if (map.get(s.charAt(j)) != null) map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                else map.put(s.charAt(j), 1);
                Set<Map.Entry<Character, Integer>> entries = map.entrySet();
                for (Map.Entry<Character, Integer> entry : entries) {
                    max = Math.max(max, entry.getValue());
                    min = Math.min(min, entry.getValue());
                }
                res += max - min;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int i = new Lc1781().beautySum("aabcb");
        System.out.println(i);
    }
}
