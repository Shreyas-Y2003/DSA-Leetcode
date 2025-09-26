class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0; // farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) return false; // if current index is not reachable
            reach = Math.max(reach, i + nums[i]); // update max reach
            if (reach >= nums.length - 1) return true; // can reach last index
        }
        return true;
    }
}
