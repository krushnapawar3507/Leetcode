// class Solution {
//     public int maxArea(int[] height) {
//         int n = height.length;
//         int maxArea = 0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int width = j-i;
//                 int ht = Math.min(height[i], height[j]);
//                 int area = width * ht;
//                 maxArea = Math.max(maxArea, area);
//             }
//         }
//         return maxArea;
//     }
// }

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            int width = right-left;
            int ht = Math.min(height[left], height[right]);
            int area = width * ht;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}