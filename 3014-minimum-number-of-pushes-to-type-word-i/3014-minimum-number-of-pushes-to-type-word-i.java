class Solution {
    public int minimumPushes(String word) {
        int m = word.length();
        int n = word.length() % 8;
        if(m <=8){
            return (m);
        }
        else if (9 <= m && m < 16){
            return (8 + (n*2));
        }
        else if(16 <= m &&  m< 24){
            return (24 + (n * 3));
        }
        
    return (48 + (n * 4));
        
    }
}