package mytest;

/**
 * @Author yxx
 * @Date 2021/8/28 12:56
 */
public class 树___是否二叉搜索树 {

    static class Treenode {
        long val;
        Treenode left;
        Treenode right;

        Treenode(long x) {
            val = x;
        }
    }

    private static boolean treemaxdepth(Treenode root, Long lower, Long higher) {
        if (root == null) {
            return true;
        }
        if (root.val > higher && root.val < lower) {
            return false;
        }
        return treemaxdepth(root.left, lower, root.val) && treemaxdepth(root.right, root.val, higher);
    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(5l);
        treenode.left = new Treenode(3l);
        treenode.right = new Treenode(4l);
        treenode.left.left = new Treenode(1l);
        boolean treemaxdepth = treemaxdepth(treenode, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println(treemaxdepth);
    }

}
