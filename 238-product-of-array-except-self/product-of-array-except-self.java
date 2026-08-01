class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int arr[] = new int[nums.length];

        int idx = -1;
        int count = 0;
        int pro = 1;

        for(int i=0; i<nums.length; i++){

            if(nums[i]==0){
                count++;
                idx = i;
                continue;
            }

            pro *= nums[i];

        }

        if(count > 1){
            return arr;
        }

        if(count == 1){
            arr[idx] = pro;
            return arr;
        }

        for(int i=0; i<nums.length; i++){
            arr[i] = pro/nums[i];
        }
        return arr;
    }
}