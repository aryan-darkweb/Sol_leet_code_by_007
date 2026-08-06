class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int i = nums[0];
        int j = nums[nums.length-1];

        for(int start = 0; start<nums.length; start++){
            while(nums[start] != i){
            list.add(i);

            i++;
            }
            i++;

        }
       return list;
        
    }
}