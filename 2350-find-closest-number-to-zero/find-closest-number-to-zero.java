class Solution {
    public int findClosestNumber(int[] nums) {
        int closest_to_zero = nums[0];
        for(int i=1;i<nums.length; i++){
            if (Math.abs(closest_to_zero) < Math.abs(nums[i])){
                continue;
            }
            else if(Math.abs(closest_to_zero) > Math.abs(nums[i])){
                closest_to_zero = nums[i];
            }
            else if(Math.abs(closest_to_zero) == Math.abs(nums[i])){
                if(closest_to_zero<=nums[i]){
                    closest_to_zero =nums[i];
                }
                else if(closest_to_zero>nums[i]){
                    continue;
                }

            }


        }
        return closest_to_zero;
    }
}