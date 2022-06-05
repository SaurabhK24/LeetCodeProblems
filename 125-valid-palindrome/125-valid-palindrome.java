class Solution {
    public boolean isPalindrome(String s) {
        
        // "race a car"
        
       String myString = s.toLowerCase();
       myString = myString.replaceAll("[^A-Za-z0-9]", "");
        
        
        int a = 0; 
        int b = myString.length() - 1;
        
        while(a <= b){
            if (myString.charAt(a) != myString.charAt(b)){
                return false;
            } else {
                a++;
                b--;
                continue;
            }
            
        }
        
        return true;
    }
}