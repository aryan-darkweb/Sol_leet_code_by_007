class Solution {
    public int maximumLengthSubstring(String s) {

        int left = 0;
        int right = 0;
        int freq[] = new int[26];

        int ans = 0;

        while(right<s.length()){
            Character ch = s.charAt(right);

            freq[ch-'a']++;

            while(freq[ch-'a']>2){
                freq[s.charAt(left)-'a']--;
                    left++;
            }

            ans = Math.max(ans, right-left+1);

            right++;
        }
        return ans;


        
    }
}