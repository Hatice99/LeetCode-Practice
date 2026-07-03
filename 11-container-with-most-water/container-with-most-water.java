class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int max_water = 0;

        while(left<right){
            int min = Math.min(height[left], height[right]);
            int max_curr_water = min*(right-left);

            max_water = Math.max(max_curr_water, max_water);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }


        }


        return max_water;
        
    }
}