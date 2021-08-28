package mytest;

/**
 * @Author yxx
 * @Date 2021/8/28 12:56
 */
public class 树___二叉搜索树公共祖先 {

    static class Treenode {
        int val;
        Treenode left;
        Treenode right;

        Treenode(int x) {
            val = x;
        }
    }

    private static Treenode treemaxdepth(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        Treenode treenode = new Treenode(nums[mid]);
        treenode.left = treemaxdepth(nums, left, mid - 1);
        treenode.right = treemaxdepth(nums, mid + 1, right);

        return treenode;

    }

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, 4};
        Treenode treemaxdepth = treemaxdepth(arr1, 0, arr1.length);

        System.out.println(treemaxdepth);
    }

}
