class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++){
            myMap.put(numbers[i],i); 
        }
        
        for (int j = 0; j < numbers.length; j++){
            int complement = target - numbers[j];
            if (myMap.containsKey(complement) && myMap.get(complement) != j){
                int[] arr = {j + 1,myMap.get(complement) + 1};
                return arr;
            }
            
        }
        
        return null;
        
    }
}