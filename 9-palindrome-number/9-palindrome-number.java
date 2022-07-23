class Solution {
    public boolean isPalindrome(int x) {
        
        String curr = Integer.toString(x);
        
        int left = 0;
        int right = curr.length() - 1;
        
        
        while(left <= right){
            if(curr.charAt(left) != curr.charAt(right)){
                return false;
            } else {
                left++;
                right--;
            }
        }
        
        return true;
        
    }
}