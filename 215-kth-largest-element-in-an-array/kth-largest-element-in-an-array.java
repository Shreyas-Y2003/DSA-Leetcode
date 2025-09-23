import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minH = new PriorityQueue<>();  // Min-heap

        for (int num : nums) {
            minH.add(num);              // Add element
            if (minH.size() > k) {      // Keep heap size = k
                minH.poll();            // Remove smallest
            }
        }
        return minH.peek();  // K-th largest
    }
}
