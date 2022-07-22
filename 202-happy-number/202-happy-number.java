class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> mySet = new HashSet<>();
        int remainder;
        int currentSum = 0;
        
        
        while(mySet.add(n)){
           currentSum = 0;
            while(n > 0){
                remainder = n % 10;
                currentSum = currentSum + (remainder * remainder);
                n = n/10;
            }
            
            if (currentSum == 1){
                return true;
                
            }
            
            n = currentSum;
        
        }
        
        return false;
  
    }
}