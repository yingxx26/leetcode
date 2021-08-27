package mytest;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 * 双指针法
 */
public class 把0移动到数组末尾 {


    private static int[] movezero(int[] source) {
        int n = source.length;
        int left1 = 0;
        int left2 = 0;
        while (left2 < n) {
            if (source[left2] != 0) {
                swap(source, left1, left2);
                left1++;
            }
            left2++;
        }
        return source;
    }

    private static void swap(int[] source, int left, int right) {
        int temp = source[left];
        source[left] = source[right];
        source[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] movezero = movezero(arr);
        System.out.println("" + movezero);
    }
}
