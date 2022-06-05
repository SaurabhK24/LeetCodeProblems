class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int a = 0;
        int b = nums.length - 1;
        
        
        while(a < nums.length && b >= 0){
            if (nums[a] + nums[b] == target){
                int[] arr = {a,b};
                return arr;
            } else {
                
                if (b - a == 1){
                    a++;
                    b = nums.length - 1;
                    continue;
                } else {
                     b--;
                    continue;
                }
                
               
            }
        }
        
        return null;
        
      
    }
}