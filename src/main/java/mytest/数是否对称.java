package mytest;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 数是否对称 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }


    private static boolean sametree(判断数是否相同.Treenode root1, 判断数是否相同.Treenode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        } else {
            return root1.val == root2.val && sametree(root1.left, root2.right) && sametree(root1.right, root2.left);
        }
    }

    public static void main(String[] args) {
        判断数是否相同.Treenode treenode = new 判断数是否相同.Treenode(0);
        treenode.left = new 判断数是否相同.Treenode(1);
        treenode.right = new 判断数是否相同.Treenode(2);

        判断数是否相同.Treenode treenode2 = new 判断数是否相同.Treenode(0);
        treenode2.left = new 判断数是否相同.Treenode(2);
        treenode2.right = new 判断数是否相同.Treenode(1);
        boolean sametree = sametree(treenode, treenode2);

        System.out.println();
    }

}
