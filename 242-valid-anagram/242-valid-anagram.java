class Solution {
    public static boolean isAnagram(String s, String t) {
        
       if (s.length() != t.length()){
           return false;
       }
        
        // s = "anagram" t = "nagaram"
        int[] countofchar = new int[26];
        
        for (int i = 0 ; i < s.length(); i++){
            countofchar[s.charAt(i) - 'a']++;
            countofchar[t.charAt(i) - 'a']--;
            
        }
        
        for (int i = 0; i < countofchar.length; i++) {
           System.out.println();
            if (countofchar[i] == 0){
                continue;
            } else {
               return false;
        }
       
        }  
       
        
        return true;
        
        
       
}
}

        
    

