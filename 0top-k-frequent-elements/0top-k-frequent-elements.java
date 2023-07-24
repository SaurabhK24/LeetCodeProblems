class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int element : nums){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.add(entry);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }

        int ans[] = new int[k];
        int index = 0;
        for (Map.Entry<Integer,Integer> entry : minHeap){
            ans[index] = entry.getKey();
            index++;
        }

        return ans;
        
    }
}