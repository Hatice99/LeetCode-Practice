class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left_pointer = 0;
        int longest_substring = 0;

        for(int right_pointer=0; right_pointer<s.length(); right_pointer++){
            while(set.contains(s.charAt(right_pointer))){
                set.remove(s.charAt(left_pointer));
                left_pointer++;
                
        }
            
            
                set.add(s.charAt(right_pointer));
                longest_substring = Math.max(longest_substring, set.size());
            

        }
        return longest_substring;
    }
}