class Solution {
    public long maxWeight(int[] pizzas) {

        Arrays.sort(pizzas);

        int n = pizzas.length/4;

        int odd = (n+1)/2;

        int even = n - odd;

        long sum = 0;

        for(int i=pizzas.length-odd; i<pizzas.length; i++){
            sum += pizzas[i];
          
        }

        int i = pizzas.length-odd-2;

        while(even-- > 0){
            sum += pizzas[i];
            i -= 2;
        }
        return sum;
        
    }
}