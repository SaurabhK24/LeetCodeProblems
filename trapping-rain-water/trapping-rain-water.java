class Solution {
    /**
     * Alright, let’s talk through this.
     * 
     * We need to figure out how much water is trapped between the bars. 
     * The key thing to notice is that at any given position, the amount of water
     * trapped is determined by the **minimum** of the tallest bar to the left and right.
     * 
     * Instead of using extra arrays to track left and right max heights, 
     * we can do it **efficiently with a two-pointer approach**:
     * 
     * **Plan:**
     * 1. Start with two pointers: `left` at 0, `right` at the last index.
     * 2. Keep track of the max height we've seen from the left (`leftMax`) 
     *    and from the right (`rightMax`).
     * 3. Always move the pointer with the **smaller max height** inward.
     *    - If `leftMax` is smaller, move `left` to the right.
     *    - If `rightMax` is smaller, move `right` to the left.
     * 4. At each step, water trapped at that position is `maxHeight - height[i]`.
     * 5. Repeat until `left` and `right` meet.
     * 
     * **Why this works:** 
     * - Since we always move the side with the smaller max, we are **guaranteed** 
     *   that the current bar's water level is correct.
     */
    public int trap(int[] height) {
        // Edge case: If no bars exist, no water can be trapped
        if (height == null || height.length == 0) return 0;

        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer
        int water = 0; // Total water trapped

        int leftMax = height[left]; // Track max height from the left
        int rightMax = height[right]; // Track max height from the right

        // Two-pointer approach
        while (left < right) {
            if (leftMax <= rightMax) {
                left++; // Move left pointer forward
                leftMax = Math.max(leftMax, height[left]); // Update left max height
                water += leftMax - height[left]; // Water trapped at this position
            } else {
                right--; // Move right pointer backward
                rightMax = Math.max(rightMax, height[right]); // Update right max height
                water += rightMax - height[right]; // Water trapped at this position
            }
        }

        return water;
    }

    /**
     * **Time Complexity:** O(n)
     * - We're only looping through the array once, so it's linear time.
     * 
     * **Space Complexity:** O(1)
     * - We only use a few extra variables (`left`, `right`, `leftMax`, `rightMax`, `water`),
     *   so it’s constant space.
     * 
     * **Why is this optimal?**
     * - Other solutions use extra arrays for left/right max heights (O(n) space).
     * - This approach avoids that by updating `leftMax` and `rightMax` dynamically.
     * - We still get the correct result but in **one pass** with no extra space.
     */
}
