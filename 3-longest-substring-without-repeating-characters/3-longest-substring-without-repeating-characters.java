class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right = 0;
        int maxLen = 0;
        
        HashSet<Character> hs = new HashSet<>();
        
        
        while(right < s.length()){
             if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                right++;
                maxLen = Math.max(hs.size(), maxLen);
                
            } else {
                hs.remove(s.charAt(left));
                left++;
                
            }
        }
        
        return maxLen;
        
        
    }
}