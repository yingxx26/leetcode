package mytest;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 */
public class erfengchazhao {

    private static Integer[] generateOrderedArray(int n) {

        assert n > 0;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;
        return arr;
    }

    private static int efcz(Integer[] source, int target, int n) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (source[mid] == target) {
                return mid;
            } else if (source[mid] < target) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] integers = generateOrderedArray(10);
        int efcz = efcz(integers, 8, 10);
        System.out.println("" + efcz);
    }
}
