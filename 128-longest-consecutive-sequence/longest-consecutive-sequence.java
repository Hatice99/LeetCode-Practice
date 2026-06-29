class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        Arrays.sort(nums);

        int max_length = 0;
        int current_length = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                continue;
            }
            else if (nums[i] + 1 == nums[i + 1]) {
                current_length++;
            } else {
                current_length = 0;
            }
            max_length = Math.max(current_length, max_length);

        }
        return max_length + 1;

    }
}