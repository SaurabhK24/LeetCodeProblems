class Solution {
    public int[] sortedSquares(int[] nums) {
        int neg = 0;
        int pos = 0;
        int[] squared_arr = new int[nums.length];
        
        
        while(pos < nums.length && nums[pos]< 0){
            pos++;
        }
        
        neg = pos - 1;
        int next_position = 0;
        
        
        while(neg >= 0 && pos < nums.length){
            if(nums[neg] * nums[neg] < nums[pos] * nums[pos]){
                squared_arr[next_position] = nums[neg] * nums[neg];       
                neg--;
            } else {
                squared_arr[next_position] = nums[pos] * nums[pos];
                pos++;
            }
            
            next_position++;
        }
        
        while(neg >= 0){
            squared_arr[next_position] = nums[neg] * nums[neg];
            neg--;
            next_position++;
        }
        
        while(pos < nums.length){
            squared_arr[next_position] = nums[pos] * nums[pos];
            pos++;
            next_position++;
            
        }
        
        return squared_arr;
        
    }
}