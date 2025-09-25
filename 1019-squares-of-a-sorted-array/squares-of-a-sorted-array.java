import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Square each element
        for (int i = 0; i < n; i++) {
            res[i] = nums[i] * nums[i];
        }

        // Sort the squared array
        Arrays.sort(res);

        return res;
    }
}
