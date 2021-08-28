package mytest;

import java.util.ArrayList;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 二叉搜索树的第k小 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static ArrayList treedepthsum(Treenode root, ArrayList res) {
        if (root == null) {
            return res;
        }
        treedepthsum(root.left, res);
        res.add(root.val);
        treedepthsum(root.right, res);
        return res;
    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(5);
        treenode.left = new Treenode(3);
        treenode.right = new Treenode(7);
        treenode.left.left = new Treenode(1);

        ArrayList treedepthsum = treedepthsum(treenode, new ArrayList());

        System.out.println(treedepthsum);
    }

}
