class Solution {
    public boolean isPalindrome(String s) {
        
        // "race a car"
        
        String myString = "";
        
        
        for (Character c : s.toCharArray()){
            if (Character.isLetter(c) || Character.isDigit(c)){
                myString = myString + c;
            }
        }
        
        myString = myString.toLowerCase();
        
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