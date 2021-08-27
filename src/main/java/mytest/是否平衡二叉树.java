package mytest;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 是否平衡二叉树 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static int height(Treenode root) {
        if (root == null) {
            return 0;
        }
        int leftdepth = height(root.left);

        int rightdepth = height(root.right);

        if (Math.abs(rightdepth - leftdepth) > 1)
            return -1;
        return Math.max(leftdepth, rightdepth) + 1;

    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);
        treenode.left.left = new Treenode(3);
        int treemaxdepth = height(treenode);

        System.out.println(treemaxdepth);
    }

}
