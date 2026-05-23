class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int len = nums.length;
        for(int i = 0; i < len; i+=2){
            //if only one element or if it not equal return the left or if it is the last element
            if(len==1 || i == len -1 || nums[i]!=nums[i+1]){
                return nums[i];

            }
        }
        return 0;
        
    }
}