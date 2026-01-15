import java.util.*;

class Solution {
    public String frequencySort(String s) {
        StringBuilder str = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();

        // 1) Count frequency
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // 2) Put keys into a list (fix KeySet -> keySet, and correct constructor usage)
        List<Character> li = new ArrayList<>(hm.keySet());

        // 3) Sort by frequency descending (avoid overflow with Integer.compare)
        li.sort((c1, c2) -> Integer.compare(hm.get(c2), hm.get(c1)));

        // 4) Build result (fix "list" -> "li")
        for (char ch : li) {
            int freq = hm.get(ch);
            for (int i = 0; i < freq; i++) {
                str.append(ch);
            }
        }

        return str.toString();
    }
}