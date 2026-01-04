class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        int r=0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max = Math.max(max,set.size());
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
                
            }
        }
        return max;
    }
}