class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int price:prices){
            min = Math.min(min, price);
            int curr_diff = price - min;
            max = Math.max(max, curr_diff); 
        }
        return max;

    }
}