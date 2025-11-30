class Solution {
    public boolean isValid(String s) {
          Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // if closing bracket
            if (map.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(c)) return false;
            } 
            else {
                // opening bracket → push
                stack.push(c);
            }
        }

        return stack.isEmpty();
        
    }
}