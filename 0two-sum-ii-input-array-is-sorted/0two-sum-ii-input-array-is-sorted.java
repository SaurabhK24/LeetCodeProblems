class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        //[2,7,11,15] target = 13
        while(left < right){
            if (numbers[left] + numbers[right] == target){
                break;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            } else {
                right--;
            }
        }

        return new int[] {left + 1, right + 1};
        
    }
}