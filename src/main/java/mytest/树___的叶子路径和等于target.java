package mytest;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 树___的叶子路径和等于target {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static boolean treedepthsum(Treenode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        boolean leftis = treedepthsum(root.left, sum - root.val);
        boolean rightis = treedepthsum(root.right, sum - root.val);
        return leftis || rightis;

    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);
        treenode.left.left = new Treenode(3);
        boolean treemaxdepth = treedepthsum(treenode, 4);

        System.out.println(treemaxdepth);
    }

}
