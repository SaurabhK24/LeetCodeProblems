class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            myMap.put(nums[i],i); 
        }
        
        for (int j = 0; j < nums.length; j++){
            int complement = target - nums[j];
            if (myMap.containsKey(complement) && myMap.get(complement) != j){
                int[] arr = {j,myMap.get(complement)};
                return arr;
            }
            
        }
        
        return null;
        
       
      
    }
}