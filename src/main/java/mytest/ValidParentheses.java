package mytest;

import java.util.Stack;

/**
 * @Author yxx
 * @Date 2021/8/24 14:46
 * 栈
 */
public class ValidParentheses {


    private static boolean valid(char[] chars) {
        Stack<Character> mystack = new Stack<Character>();
        for (Character mychar : chars) {
            if ('(' == mychar || '[' == mychar || '{' == mychar) {
                mystack.push(mychar);
            } else {
                Character pop = mystack.pop();
                Character match;
                if (')' == mychar) {
                    match = '(';
                } else if (']' == mychar) {
                    match = '[';
                } else {
                    match = '{';
                }
                if (match != pop) return false;
            }
        }
        if (mystack.size() != 0) {
            return false;
        } else
            return true;
    }

    public static void main(String[] args) {
        String x = "()[]{";
        char[] chars = x.toCharArray();
        boolean valid = valid(chars);
        System.out.println();
    }

}
