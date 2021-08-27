package mytest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 判断数是否相同 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static boolean sametree(Treenode root1, Treenode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        } else if (root1.val != root2.val) {
            return false;
        } else {
            return sametree(root1.left, root2.left) && sametree(root1.right, root2.right);
        }
    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);

        Treenode treenode2 = new Treenode(0);
        treenode2.left = new Treenode(1);
        treenode2.right = new Treenode(2);
        boolean sametree = sametree(treenode, treenode2);

        System.out.println();
    }

}
