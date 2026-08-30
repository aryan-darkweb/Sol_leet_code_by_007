class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        int mxPos = 0;
        int mnPos = 0;

        for(int i=0; i<n; i++){
            if(nums[i] > mx){
                mx = nums[i];
                mxPos = i;
            }

            if(nums[i] < mn){
                mn = nums[i];
                mnPos = i;
            }
        }

        int big = Math.max(mxPos, mnPos);
        int sml = Math.min(mxPos, mnPos);

        int r = (n-big)+sml+1;

        return Math.min(big+1, Math.min(n-sml, r));
        
    }
}