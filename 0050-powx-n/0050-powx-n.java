// class Solution {
//     public double myPow(double x, int n) {
//        double ans = 1;
//         for(int i=1;i <n; i++){
//             ans = ans * x;
//         }
//         return ans;
//     }
// }

class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
}