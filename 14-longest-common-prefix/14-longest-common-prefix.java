class Solution {
    public String longestCommonPrefix(String[] strs) {
       
      
        
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] second = strs[strs.length - 1].toCharArray();
        
        

        String prefix = "";
        for (int i = 0; i < first.length; i++){
            
            if (first[i] != second[i]){
                break;
            } else {
              prefix = prefix + first[i];
            }
            
        }
        
        if (prefix.length() > 0){
            return prefix;
        }
        
        
        return "";
    }
}