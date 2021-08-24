package mytest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class treepre {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static void pre(Treenode root, List res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        pre(root.left, res);
        pre(root.right, res);

    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);
        List res = new ArrayList<>();
        pre(treenode, res);

        System.out.println();
    }

}
