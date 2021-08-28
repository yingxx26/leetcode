package mytest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 树___的最大深度 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static int treemaxdepth(Treenode root) {
        if (root == null) {
            return 0;
        }
        int treemaxdepth = treemaxdepth(root.left);
        int treemaxdepth1 = treemaxdepth(root.right);
        return Math.max(treemaxdepth, treemaxdepth1)+1;

    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);
        treenode.left.left = new Treenode(3);
        int treemaxdepth = treemaxdepth(treenode);

        System.out.println(treemaxdepth);
    }

}
