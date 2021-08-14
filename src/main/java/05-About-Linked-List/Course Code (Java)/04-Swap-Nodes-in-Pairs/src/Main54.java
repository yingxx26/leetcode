// Definition for singly-linked list.
// 在Java版本中，我们将LinkedList相关的测试辅助函数写在ListNode里
public class Main54 {

    public int val;
    public Main54 next = null;

    public Main54(int x) {
        val = x;
    }

    // 根据n个元素的数组arr创建一个链表
    // 使用arr为参数，创建另外一个ListNode的构造函数
    public Main54(int[] arr){

        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr can not be empty");

        this.val = arr[0];
        Main54 curNode = this;
        for(int i = 1 ; i < arr.length ; i ++){
            curNode.next = new Main54(arr[i]);
            curNode = curNode.next;
        }
    }

    // 返回以当前ListNode为头结点的链表信息字符串
    @Override
    public String toString(){

        StringBuilder s = new StringBuilder("");
        Main54 curNode = this;
        while(curNode != null){
            s.append(Integer.toString(curNode.val));
            s.append(" -> ");
            curNode = curNode.next;
        }
        s.append("NULL");
        return s.toString();
    }
}
