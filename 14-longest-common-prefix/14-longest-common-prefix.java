class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        int shortestLength = Integer.MAX_VALUE;
        
        for (String current : strs){
            if (current.length() < shortestLength){
                shortestLength = current.length();
            }
        }
        
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] second = strs[strs.length - 1].toCharArray();
        
        

        String prefix = "";
        for (int i = 0; i < shortestLength; i++){
            
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