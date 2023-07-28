class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if(s == null || s.length() <= 1) {
            return false;
        }

        try {
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if(c == ')'){
                    if(stack.pop() == '(') {
                        continue;
                    } else {
                        return false;
                    }
                } else if(c == '}'){
                    if(stack.pop() == '{') {
                        continue;
                    } else {
                        return false;
                    }
                } else if(c == ']'){
                    if(stack.pop() == '[') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        } catch(Exception e){ 
            return false;
        }
        
        if(stack.size() != 0) {
            return false;
        }
        return true;
    }
}