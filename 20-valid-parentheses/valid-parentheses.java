class Solution {
    public boolean isValid(String s) {

        if (s == null || s.length() <= 1)
            return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                }
            else if(stack.isEmpty()){
                return false;
            }
             else if (s.charAt(i) == ']') {
                char top_element = stack.peek();
                if (top_element == '[') {
                    stack.pop();
                }
                else{
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                char top_element = stack.peek();
                if (top_element == '{') {
                    stack.pop();
                }
                                else{
                    return false;
                }
                
            } else if (s.charAt(i) == ')') {
                char top_element = stack.peek();
                if (top_element == '(') {
                    stack.pop();
                }
                                else{
                    return false;
                }
            }

        }
        if (stack.isEmpty())
            return true;

        return false;

    }
}