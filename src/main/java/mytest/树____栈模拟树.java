package mytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 树____栈模拟树 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static void pre(Treenode root, List res) {
        Stack<Treenode> stack = new Stack<Treenode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            Treenode cur = stack.pop();
            root = cur.right;
        }
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
