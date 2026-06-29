class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left_pointer = 0;
        int right_pointer = s.length() - 1;

        while (left_pointer < right_pointer) {
            if (s.charAt(left_pointer) != s.charAt(right_pointer)) {
                return false;
            }
            left_pointer++;
            right_pointer--;
        }
        return true;

    }
}