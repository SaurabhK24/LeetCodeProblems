class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        
        int currentSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            currentSum = currentSum + nums[i];
            arr[i] = currentSum;
            
        }
        
        return arr;
    }
}