class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len; i+=2){
            if(len==1 || i == len -1 || nums[i]!=nums[i+1]){
                return nums[i];

            }
        }
        return 0;
        
    }
}