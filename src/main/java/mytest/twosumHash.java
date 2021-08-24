package mytest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yxx
 * @Date 2021/8/22 14:20
 * hash表
 */
public class twosumHash {


    private static String twosum(int[] source, int target) {

        Map<Integer, Integer> hashdata = new HashMap<Integer, Integer>();

        int i = 0;
        int n = source.length - 1;
        while (i < n) {
            if (hashdata.containsKey(target - source[i++])) {
                return i + " " + (hashdata.get(target - source[i]));
            }
            hashdata.put(source[i], i);
        }

        return "null";
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        String twosum = twosum(arr, 4);
        System.out.println("" + twosum);
    }
}
