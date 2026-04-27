class Solution {
    public int[] twoSum(int[] nums, int target) {
        //repeated operation: lookup -> use hashmap for efficieny

        Map<Integer, Integer> map_of_nums = new HashMap<>();
        int first_element = nums[0];

        for(int i=0; i<nums.length; i++){
            int rest = target-nums[i];
            if(map_of_nums.containsKey(rest)){
                return new int[]{i, map_of_nums.get(rest)};
            }
            map_of_nums.put(nums[i],i);

        }
        return new int[]{};
        
    }
}