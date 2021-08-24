package mytest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 * 指针
 */
public class IntersectionTwoArrays {


    private static int[] intersectionTwoArrays(int[] source1, int[] source2) {
        int index = 0;
        int index1 = 0;
        int index2 = 0;

        int length1 = source1.length;
        int length2 = source2.length;
        Arrays.sort(source1);
        Arrays.sort(source2);
        int[] result = new int[length1 + length2];

        while (index1 < length1 && index2 < length2) {

            int num1 = source1[index1];
            int num2 = source2[index2];

            if (num1 == num2) {
                if (index == 0 || num1 != result[index - 1]) {
                    result[index++] = num1;
                    index1++;
                    index2++;
                }
            } else if (num1 < num2) index1++;
            else if (num1 > num2) index2++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 6, 5};
        int[] ints = intersectionTwoArrays(arr1, arr2);
        System.out.println("" + ints);
    }
}
