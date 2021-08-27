package mytest;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 * 指针对撞
 */
public class 有序数组的两个数的和等于target {


    private static String twosum(int[] source, int target) {
        int low = 0;
        int high = source.length - 1;
        while (low < high) {
            int sum = source[low] + source[high];
            if (sum == target) return low + "" + high;
            else if (sum < target) low++;
            else if (sum > target) high--;
        }

        return "null";
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        String twosum = twosum(arr, 4);
        System.out.println("" + twosum);
    }
}
