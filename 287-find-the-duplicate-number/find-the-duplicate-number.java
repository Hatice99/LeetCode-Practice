class Solution {
    public int findDuplicate(int[] nums) {
        int[] counter_arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            counter_arr[nums[i]]++;
            if(counter_arr[nums[i]]>1) return nums[i];
        }
        return -1;

    }
    
    
}