class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int rest = target - nums[i];

            if(map.containsValue(rest)){
                int key = 0;
                for(Integer k: map.keySet()){
                    if(map.get(k) == rest){
                        key = k;
                    }
                }
                return new int[] {i,key};
            }
            else map.put(i, nums[i]);
        }
        return new int[]{};
                     

        
    }
}