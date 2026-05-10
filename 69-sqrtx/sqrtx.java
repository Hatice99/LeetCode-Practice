class Solution {
    public int mySqrt(int x) {
        int n = 0;
        while((long)n*n<=x){
            n++;
        }
        return n-1;
        
    }
}