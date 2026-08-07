class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        boolean flag = false;
        if(i<n && s.charAt(i)=='-'){
        flag = true;
        i++;
        }else if(i<n && s.charAt(i)=='+'){
            flag = false;
            i++;
        }

        

        while(i<n && s.charAt(i)=='0'){
            i++;
        }

        long ans = 0;

        while(i<n && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i)-'0';

            ans = (ans*10)+(digit);

                        if (!flag && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (flag && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return flag?(int)-ans:(int)ans;
        
    }
}