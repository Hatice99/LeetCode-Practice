class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while(left<=right){
            int midd = (left + right)/2;
            long square = (long)midd*midd;
            if(square == num) return true;
            else if(square < num) left = midd+1;
            else if(square > num) right = midd-1;
        } 
        return false;
        
    }
}