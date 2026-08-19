class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ans[] = new int[2];

        ans[0] = findIdx(nums, target, true);
        ans[1] = findIdx(nums, target, false);

        return ans;
        
    }

    public int findIdx(int []nums, int target, boolean first){
        int left = 0;
        int right = nums.length-1;
        int mid;

        int res = -1;

        while(left<=right){

            mid = left + (right-left)/2;

            if(nums[mid]==target){
                res = mid;

                if(first)
                    right = mid-1;
                else
                    left = mid+1;

            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return res;
    }
}