class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix_array=new int [nums.length];
        int[] suffix_array=new int [nums.length];

        int[] answer_array=new int [nums.length];

        //calculation of prefix array
        prefix_array[0] = 1;
        for(int i=1; i<nums.length; i++){
            prefix_array[i] = prefix_array[i-1] * nums[i-1]; 
        }

        //calculation of suffix array
        suffix_array[nums.length-1] = 1;
        for(int i=nums.length-2; i >=0; i--){
            suffix_array[i] = suffix_array[i+1] * nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            answer_array[i] = prefix_array[i] * suffix_array[i];
        }

        return answer_array;
        
    }
}