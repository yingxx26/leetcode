package mytest;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 * 滑动窗口
 */
public class 数组___最小子数组和 {


    private static int minSubArrayLen(int[] source, int target) {

        int n = source.length - 1;
        int res = n + 1;
        int sum = 0, l = 0, r = 0;
        while (l < n) {
            sum = sum + source[++r];
            while (sum >= target) {
                res = Math.min(res, r - l + 1);
                sum = sum - source[l++];
            }
        }
        if (res == n + 1) return 0;
        else return res;
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4,5,6,7};
        int Len = minSubArrayLen(arr, 11);
        System.out.println("" + Len);
    }
}
