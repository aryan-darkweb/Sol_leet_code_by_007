class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ans = new LinkedList<>();

        int belowTargetCount = 0;
        int targetCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<target){
                belowTargetCount += 1;
            }else if(nums[i] == target){
                targetCount += 1;
            }
        }

        for(int i=0; i<targetCount; i++){
            ans.add(belowTargetCount);
            belowTargetCount++;
        }
        return ans;
        
    }
}