class Solution {
    public boolean checkDivisibility(int n) {

        long sum = 0;
        long pro = 1;

        int m = n;

        while(n>0){
            int digit = n % 10;

            sum += digit;
            pro *= digit;

            n /= 10;
        }

        //if(count == 1) return true;

        return (m % (sum+pro) == 0);
        
    }
}