class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int count = 0;
        int average = 0;
        int sum = 0;
        
        for (int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
    
        average = sum / k;
        
        if (average >= threshold){
            count++;
        }
        
        for (int i = k; i < arr.length; i++){
            sum = sum - arr[i - k];
            sum = sum + arr[i];
            
            average = sum / k;
            
            if (average >= threshold){
                count++;
            }
        }
        

        return count;
        
    }
}
/**
  
**/