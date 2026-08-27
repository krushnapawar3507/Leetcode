// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int n = arr.length;
//         int i;
//         for(i=0;i<n-1;i++){
//             if(arr[i+1] < arr[i]){
//                 return i;
//             }
//     }
//       return i;
// }
// }

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int st = 1;
        int end = n-2;
        int mid = 0;

        while(st <= end) {
            mid = st + (end-st)/2;    
            if(arr[mid-1] < arr[mid] && arr[mid]> arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
                }
                return -1;
}
}