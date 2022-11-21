package algorithms.chain;

import lombok.Data;

@Data
class ListNode{
    public int val;
    public ListNode next;
}

public class ReverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ReverseList reverseList = new ReverseList();

        int[] head = {1,2,3,4,5};
        var heads = reverseList.makeListNode(listNode,head);
        System.out.println(" 第幾個 " + heads.next.val);
        System.out.println("heads = " + heads);

//        reverseList.reverseLists(heads);
    }

    public ListNode makeListNode (ListNode listNode,int[] head){

        return makeListNode(listNode,head,0);
    }

    public ListNode makeListNode(ListNode listNode ,int[] head, int length){
        System.out.println("題目組成"+ listNode.val);
        if (length >= head.length) {
            return listNode;
        }

        System.out.println("head[length] = " + head[length]);
        int h = head[length];
        System.out.println("h = " + h);
        listNode.setVal(h);
        System.out.println("listNode.val1 =" + listNode.getVal());
        listNode.setNext(makeListNode(listNode,head,length+1));

        System.out.println("listNode.val2 =" + listNode.getVal());
        return listNode;
    }

    public ListNode reverseLists(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseLists(head.next);
        head.next.next = head;
        head.next = null;
        System.out.println("head = " + head.val);
        return p;
    }

}
