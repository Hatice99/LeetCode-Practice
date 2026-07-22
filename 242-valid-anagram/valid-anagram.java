class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] new_s = s.toCharArray();
        char[] new_t = t.toCharArray();
        Arrays.sort(new_s);
        Arrays.sort(new_t);

        for(int i = 0; i<s.length(); i++){
            if(new_s[i] != new_t[i]) return false;

        }
        return true;
        
    }
}