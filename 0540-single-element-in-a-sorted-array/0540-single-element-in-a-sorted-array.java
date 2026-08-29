
// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int n = nums.length;
//         int st = 0;
//         int end = n-1;
//         while(st <= end){
//             int mid = st + (end-st)/2;
//             if(mid == 0 && nums[0] != nums[1]){
//                 return nums[mid];
//             }
//             if(mid == n-1 && nums[n-1] != nums[n-2]){
//                 return nums[mid];
//             }
//             if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
//                 return nums[mid];
//             }
//             if(mid % 2 == 0){ 
//                 if(nums[mid-1] == nums[mid]){//right
//                     end = mid-1;
//                 }
//                 else{//left
//                     st = mid+1;
//                 }
//             }
//             else{//odd
//                 if(nums[mid-1] == nums[mid]){//left
//                     st = mid+1;
//                 }
//                 else{//right
//                     end = mid-1;
//                 }
//             }

//             }
        
//         return -1;
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // pair is correct
                // single element is on right
                st = mid + 2;
            }
            else {
                // pair is broken
                // single element is on left or at mid
                end = mid;
            }
        }

        return nums[st];
    }
}