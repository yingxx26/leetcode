package mytest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author yxx
 * @Date 2021/8/23 20:41
 */
public class 链表___翻转链表 {

    public static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    public static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);

        Node reverse = reverse(node);
        System.out.println();


        List<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(2);
        list.add(6);

        Collections.sort(list);
        System.out.println();
    }
}
