// Definition for singly-linked list.
// 在Java版本中，我们将LinkedList相关的测试辅助函数写在ListNode里
public class Main55 {

    public int val;
    public Main55 next = null;

    public Main55(int x) {
        val = x;
    }

    // 根据n个元素的数组arr创建一个链表
    // 使用arr为参数，创建另外一个ListNode的构造函数
    public Main55(int[] arr){

        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr can not be empty");

        this.val = arr[0];
        Main55 curNode = this;
        for(int i = 1 ; i < arr.length ; i ++){
            curNode.next = new Main55(arr[i]);
            curNode = curNode.next;
        }
    }

    Main55 findNode(int x){

        Main55 curNode = this;
        while(curNode != null){
            if(curNode.val == x)
                return curNode;
            curNode = curNode.next;
        }
        return null;
    }

    // 返回以当前ListNode为头结点的链表信息字符串
    @Override
    public String toString(){

        StringBuilder s = new StringBuilder("");
        Main55 curNode = this;
        while(curNode != null){
            s.append(Integer.toString(curNode.val));
            s.append(" -> ");
            curNode = curNode.next;
        }
        s.append("NULL");
        return s.toString();
    }
}
