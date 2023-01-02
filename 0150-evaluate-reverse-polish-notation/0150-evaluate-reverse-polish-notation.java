class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       for(int i=0;i<tokens.length;i++){
           if(tokens[i].equals("*"))
           stack.push(stack.pop()*stack.pop());
            else if(tokens[i].equals("/"))
           stack.push((int)(1D/stack.pop()*stack.pop()));
            else if(tokens[i].equals("+"))
           stack.push(stack.pop()+stack.pop());
            else if(tokens[i].equals("-"))
           stack.push(-stack.pop()+stack.pop());
           else
           stack.push(Integer.valueOf(tokens[i]));
       }
       return stack.pop();
    }
}