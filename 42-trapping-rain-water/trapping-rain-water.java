class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left_max = new int[len];
        int[] right_max = new int[len];

        int max_len_left = 0;
        for(int i=0; i< len; i++){
            int current_max = height[i];
            max_len_left = Math.max(current_max, max_len_left);
            left_max[i] =  max_len_left;
        }

        int max_len_right = 0;
        for(int i=len-1; i>= 0; i--){
            int current_max = height[i];
            max_len_right = Math.max(current_max, max_len_right);
            right_max[i] =  max_len_right;
        }

        int sum_area = 0;
        for(int i=0; i< len; i++){
            int min_area = Math.min(right_max[i], left_max[i]);
            int current_area = min_area - height[i];
            sum_area += current_area;
        }

        return sum_area;
        
    }
}