package mytest;

/**
 * @Author yxx
 * @Date 2021/8/23 20:41
 */
public class 删除链表 {

    public static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    public static Node deleteLinkedList(Node head, int targetVal) {

        Node vhead = new Node(0);
        vhead.next = head;
        Node cur = vhead;
        while (cur.next != null) {
            if (cur.next.val == targetVal) {
                Node delnode = cur.next;
                cur.next = delnode.next;
            } else {
                cur = cur.next;
            }
        }
        return vhead.next;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);

        Node reverse = deleteLinkedList(node, 5);
        System.out.println();
    }
}
