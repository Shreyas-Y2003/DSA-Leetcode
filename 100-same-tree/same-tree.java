class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;   // both null → same
        if (p == null || q == null) return false;  // one null → not same

        if (p.val != q.val) return false;          // values must match

        // check left and right recursively
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
