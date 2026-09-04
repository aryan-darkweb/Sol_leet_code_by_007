class Solution {

    public int findMin(int [] nums, int j){

        int mn = Integer.MAX_VALUE;
        int idx = j;

        for(int i=j; i<nums.length; i++){
            if(nums[i] < mn){
                mn = nums[i];
                idx = i;
            }
        }
        return idx;
    }
    public int firstStableIndex(int[] nums, int k) {

        int mn = Integer.MAX_VALUE;
        int idx = -1;
        int mx = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < mn){
                mn = nums[i];
                idx = i;
            }
        }

        for(int j=0; j<nums.length; j++){
            if(j > idx){
                idx = findMin(nums, j);
                mn = nums[idx];
            }

            if(nums[j]>mx){
                mx = nums[j];
            }

            if((mx-mn)<=k){
                return j;
            }
            
        }

        return -1;
        
    }
}