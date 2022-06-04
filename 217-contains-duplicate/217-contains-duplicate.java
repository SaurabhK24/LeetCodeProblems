class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 1;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            if (myMap.containsKey(nums[i])){
                count = myMap.get(nums[i]);
                myMap.put(nums[i],count++);
                
            }
            myMap.put(nums[i],count);
        }
        
        for (int i = 0; i < nums.length; i++){
            if (myMap.get(nums[i]) > 1){
                return true;
            }
        }
        
        return false;
        
    }
}