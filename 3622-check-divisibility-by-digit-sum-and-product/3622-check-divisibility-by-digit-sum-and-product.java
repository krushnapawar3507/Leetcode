class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int m = n;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            n = n / 10;
        }
        int total = sum + product;
        if(total == 0){
            return false;
        }
        return (m % total == 0);
    }
}