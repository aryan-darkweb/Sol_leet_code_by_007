class Solution {
    public int minimumPushes(String word) {

        Integer freq[] = new Integer[26];

        Arrays.fill(freq, 0);

        for(char c: word.toCharArray()){

            freq[c-'a']++;
        }

        Arrays.sort(freq, (a,b)->b-a);


        int count = 0;

        for(int i=0; i<26; i++){
            if(i<8){
                count += freq[i];
            }else if(i>=8 && i<16){
                count += freq[i]*2;
            }else if(i>=16 && i<24){
                count += freq[i]*3;
            }else{
                count += freq[i]*4;
            }

        }
        return count;


        
    }
}