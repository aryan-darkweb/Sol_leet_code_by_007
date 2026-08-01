class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        

        int mxLen = 0;
        int start = 0;
       

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);

            if(map.containsKey(c) && map.get(c) >= start){
                start = map.get(c)+1;
            }
                map.put(c, i);
                mxLen = Math.max(mxLen, i-start+1);
                
            }

        

        return mxLen;
        
    }
}