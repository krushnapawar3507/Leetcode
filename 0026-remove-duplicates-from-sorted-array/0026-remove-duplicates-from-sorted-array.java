// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if(nums.length == 0){
//             return 0;
//         }
//         int i=0;
//         int j = 1;
//         while(j<nums.length){
//             if(nums[i] == nums[j]){
//                 j++;
//             }
//             else{
//                 nums[i+1] = nums[j];
//                 i++;
//                 j++;
//             }
            
//         }
//         return i+1;
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[count]= nums[i+1];
                count++;
            }
        }
        return count;
    }
}
