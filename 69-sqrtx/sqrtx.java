class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while(left <= right){
            int middle = (left + right)/2;
            long multiplication = (long)middle*middle;
            if(multiplication < x){
                left = middle + 1;
            }
            else if(multiplication >x){
                right = middle-1;
            }
            else{
                return middle;
            }
        

        
    }
    return right;
}
}