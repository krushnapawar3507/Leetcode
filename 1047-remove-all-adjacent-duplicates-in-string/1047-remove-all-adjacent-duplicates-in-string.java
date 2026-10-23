class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek() == ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                //if empty
                st.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();
    }
}