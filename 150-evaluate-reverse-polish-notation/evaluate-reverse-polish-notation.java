class Solution {
    public int evalRPN(String[] tokens) {
        Deque <String> stack = new ArrayDeque<>();

        for(String s: tokens){
            int value = 0;
            if(s.equals("+")){
                int top = Integer.parseInt(stack.pop());
                int before_top = Integer.parseInt(stack.pop());
                value = before_top + top;
                stack.push(Integer.toString(value));
            }
            else if(s.equals("-")){
                int top = Integer.parseInt(stack.pop());
                int before_top = Integer.parseInt(stack.pop());
                value = before_top - top;
                stack.push(Integer.toString(value));
            }
            else if(s.equals("*")){
                int top = Integer.parseInt(stack.pop());
                int before_top = Integer.parseInt(stack.pop());
                value = before_top * top;
                stack.push(Integer.toString(value));
            }
            else if(s.equals("/")){
                int top = Integer.parseInt(stack.pop());
                int before_top = Integer.parseInt(stack.pop());
                value = before_top / top;
                stack.push(Integer.toString(value));
            }
            else{
                stack.push(s);
            }
        }
        int result = Integer.parseInt(stack.peek());

        return result;
        
    }
}