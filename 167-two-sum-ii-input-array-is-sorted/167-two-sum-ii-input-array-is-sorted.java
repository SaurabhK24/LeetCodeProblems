class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        
        int a = 0;
        int b = numbers.length - 1;
       
        while(a < b){
            if(numbers[a] + numbers[b] == target){
                break;
            } 
            if(numbers[a] + numbers[b] < target) {
                a++;
            } else {
                b--;
            }
                
        }
        return new int[]{a + 1, b + 1};
    }
        

}