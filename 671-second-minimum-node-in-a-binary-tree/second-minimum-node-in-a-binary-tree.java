class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int min) {
        if (node == null) return -1;
        if (node.val > min) return node.val;  // candidate for second minimum

        int left = dfs(node.left, min);
        int right = dfs(node.right, min);

        if (left == -1) return right;
        if (right == -1) return left;
        return Math.min(left, right);
    }
}
