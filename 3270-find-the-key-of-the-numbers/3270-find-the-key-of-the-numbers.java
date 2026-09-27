class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int n=4;
        int key = 0;
        
        for(int i=0;i<n;i++){
            int l1 = num1 % 10;
            num1 /= 10;
            int l2 = num2 % 10;
            num2 /= 10;
            int l3 = num3 % 10;
            num3 /= 10;

        int min1 = Math.min(l1, Math.min(l2,l3));
         key = key + min1 * (int)Math.pow(10, i);
        }
return key;


    }
}