// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         int i;
//         for( i=0;i<n-1;i += 2){
//             if(nums[i] != nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return nums[n-1];
//         }
//     }


class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}


