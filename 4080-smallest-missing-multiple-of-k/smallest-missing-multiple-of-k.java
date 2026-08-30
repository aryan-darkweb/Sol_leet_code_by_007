class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        int i = k;
        int j = 0;

        while(set.contains(i)){

            i += k;
        }

        return i;
    }
}