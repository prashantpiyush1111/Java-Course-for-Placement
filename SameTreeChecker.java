class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SameTreeChecker {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        if (p != null && q != null) {
            return p.val == q.val
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right);
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        SameTreeChecker checker = new SameTreeChecker();
        System.out.println(checker.isSameTree(p, q));
    }
}