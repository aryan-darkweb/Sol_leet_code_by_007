class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length-1;
        int mid;

        while(left<=right){
            mid = left + (right-left)/2;

            if(mid>0 && (letters[mid] > target) && (letters[mid-1] <= target)){
                return letters[mid];
            }else if(mid>0 && (letters[mid] > target) && (letters[mid-1]>target)){
                right = mid-1;

            }else{
                left = mid+1;
            }
        }
        return letters[0];
        
    }
}