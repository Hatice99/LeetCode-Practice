class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 9  turn into 0
            digits[i] = 0;
        }
        //every digit was 9, so just add 1 in front
        int[] new_digits = new int[len + 1];
        new_digits[0] = 1;
        return new_digits;

    }
}