class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int count = k; // 1
        int ans = 0;
        
        // [3,2,1,5,6,4], k = 2
        
        // [1,2,3,4,5,6], k = 2
        for(int i = nums.length - 1; i >= 0; i--){
            if (count == 1){
                ans = nums[i];
            }
            count--;
        }
        return ans;
    }
}