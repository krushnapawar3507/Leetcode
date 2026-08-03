class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int m = n;
        int i=n-1;
        while(i >= 0){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            else {
                digits[i] = 0;
                i--;
            }
        }
        int nums[] = new int [m+1];
        nums[0] = 1;
        return nums;
        }
    }
