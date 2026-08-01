class Solution {
    public int maximumProduct(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x : nums){
            pq.offer(x);
        }

        for(int i=0; i<k; i++){
            int x = pq.poll();
            pq.offer(x+1);
        }

        long mod = 1_000_000_007L;
        long ans = 1;

        for(int i=0; i<nums.length; i++){
            ans = (ans*pq.poll()) % mod;
        }

        return (int)ans;
        
    }
}