class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);
            // checking for opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else {
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') ||
                    s.peek() == '{' && ch == '}' ||
                    s.peek() == '[' && ch == ']'){
                        s.pop();
                    }
                else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}