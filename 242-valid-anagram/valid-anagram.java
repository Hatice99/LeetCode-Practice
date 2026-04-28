class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] counter = new int[26]; //26 letters in alphabet

        for(int i=0; i<s.length(); i++){
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);
            counter[char_s-'a']++;
            counter[char_t-'a']--;
        }

        for(int i=0; i<counter.length; i++){
            if(counter[i] > 0){
                return false;
            }
           
        }
         return true;


    }
}