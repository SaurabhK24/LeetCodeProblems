import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(Math.pow(points[i][0] - 0, 2) + Math.pow(points[i][1] - 0, 2));
            map.put(i, distance);
        }

        PriorityQueue<Map.Entry<Integer, Double>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Double> pair : map.entrySet()) {
            maxHeap.add(pair);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];
        int index = 0;
        for (Map.Entry<Integer, Double> pair : maxHeap) {
            int i = pair.getKey();
            res[index][0] = points[i][0];
            res[index][1] = points[i][1];
            index++;
        }

        return res;
    }
}
