class Solution {
    public boolean isValid(String s) {
        
        if (s.length() % 2 != 0){
            return false;
        }
        
        Stack<Character> myStack = new Stack<>();
        
        for (char current : s.toCharArray()){
            if (current == '}' && !myStack.isEmpty() && myStack.peek() == '{'){
                myStack.pop();
            } else if (current == ')' && !myStack.isEmpty() && myStack.peek() == '('){
                myStack.pop();
            } else if (current == ']' && !myStack.isEmpty() && myStack.peek() == '['){
                myStack.pop();
            } else {
                myStack.push(current);
            }

        }
         return myStack.isEmpty();
    }
}
