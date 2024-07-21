class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && open++ > 0) result.append(c);
            if (c == ')' && open-- > 1) result.append(c);
        }
        
        return result.toString();
    }
}

