class Solution {
    public int minimumPushes(String word) {

        int count = 0;
        for(int i=1; i<=word.length(); i++){
            if(i<=8){
                count++;
            }else if(i>=9 && i<=16){
                count += 2;
            }else if(i>=17 && i<=24){
                count+=3;
            }else{
                count+=4;
            }
        }
        return count;
        
    }
}