package mytest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 树___树的层次遍历 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static void pre(Treenode root, List<List<Integer>> levels, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(root.val);
        if (root.left != null) {
            pre(root.left, levels, level + 1);
        }
        if (root.right != null) {
            pre(root.right, levels, level + 1);
        }
    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        pre(treenode, res, 0);

        System.out.println();
    }

}
