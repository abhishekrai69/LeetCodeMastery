class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDiameter;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Update the diameter at this node
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        // Return the depth of this node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}