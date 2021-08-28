package mytest;

/**
 * @Author yxx
 * @Date 2021/8/24 15:26
 * 树排序
 */
public class 树___树的翻转 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static Treenode treereverse(Treenode root) {
        if (root == null) {
            return null;
        }
        Treenode treeleft = treereverse(root.left);
        Treenode treeright = treereverse(root.right);
        root.left = treeright;
        root.right = treeleft;
        return root;

    }

    public static void main(String[] args) {
        Treenode treenode = new Treenode(0);
        treenode.left = new Treenode(1);
        treenode.right = new Treenode(2);
        treenode.left.left = new Treenode(3);
        Treenode treereverse = treereverse(treenode);

        System.out.println(treereverse);
    }

}
