class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
    return Integer.MAX_VALUE;

        int count = 0;
        
        boolean negi = (dividend<0) ^ (divisor<0);

        long div = Math.abs((long)dividend);
        long dis = Math.abs((long)divisor);

        while(div >= dis){

            long temp = dis;
            int m = 1;

            while((temp<<1) <= div){
                temp <<= 1;
                m <<= 1;
            }

            div -= temp;
            count += m;
        }

        return negi? -count:count;
        
    }
}