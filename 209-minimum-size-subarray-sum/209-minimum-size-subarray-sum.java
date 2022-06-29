class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int returnLength = Integer.MAX_VALUE;
        
        for(int right = 0; right < nums.length; right++){
            currentSum += nums[right];
            
            while(currentSum >= target){
                returnLength = Math.min(returnLength, (right - left) + 1);
                currentSum = currentSum - nums[left];
                left++;
            }
        }
        
        return returnLength == Integer.MAX_VALUE ? 0 : returnLength;
    
    }
        
        
}
