class Solution {
    public int mySqrt(int x) {
        // power / root
        
        long i = 0;
//5
        while(i * i  < x){
            i++;
        }
        
        if (i*i > x){
            i--;
        }
        
        int returnVal = (int) i;
        
        return returnVal;
        
        
    }
}