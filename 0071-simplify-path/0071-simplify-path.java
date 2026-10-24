class Solution {
    public String simplifyPath(String path) {
        Stack<String>st = new Stack<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.isEmpty()){
                continue;
            }
            if(part.equals(".")){
                continue;
            }
            if(part.equals("..") && st.isEmpty()){
                continue;
            }
            if(part.equals("..") && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(part);
            }
        }
        if(st.isEmpty()){
            return "/";
        }
        else{
            StringBuilder str =new StringBuilder();
            while(!st.isEmpty()){
                str.insert(0, "/" +st.pop());
            }
            return str.toString();
        }

    }
}