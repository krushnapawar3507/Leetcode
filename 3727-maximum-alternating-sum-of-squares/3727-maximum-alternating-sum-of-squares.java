class Solution {
    public long maxAlternatingSum(int[] nums) {
        int arr[] = new int[nums.length];
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        int i=0;
        int j= nums.length-1;
        while(i<=j){
            if(i==j){
                sum = sum + arr[i];
                break;
            }
            sum = sum + arr[j];
            sum = sum - arr[i];
            i++;
            j--;
        }
        return sum;
    }
}