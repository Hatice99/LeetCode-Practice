class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer_array = new int[nums.length];

        answer_array[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer_array[i] = answer_array[i - 1] * nums[i - 1];
        }

        int value = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            value = value * nums[i + 1];
            answer_array[i] = answer_array[i] * value;

        }

        return answer_array;

    }
}