package mytest;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 * 滑动窗口
 */
public class 最大连续子数组长度 {


    private static int minSubArrayLen(char[] source) {
        int freq[] = new int[256];
        int n = source.length - 1;
        int res = 0;
        int l = 0, r = -1;
        while (l < n) {
            freq[source[++r]]++;
            while (freq[source[r + 1]] != 0) {
                freq[source[l++]]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res + 1;
    }

    public static void main(String[] args) {
        String arr = "ABBEFGHDDDJJJ";
        char[] chars = arr.toCharArray();
        int Len = minSubArrayLen(chars);
        System.out.println("" + Len);
    }
}
