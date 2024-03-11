package linear.reverslinkedlist;

import linear.ListNode;

public class ReverseLinkedListMain {

    public static void main(String[] args) {

//        ReverseLinkedList1 reverseLinkedList = new ReverseLinkedList1();
        ReverseLinkedList2 reverseLinkedList = new ReverseLinkedList2();

        long start = System.nanoTime();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        ListNode listNode = reverseLinkedList.reverseLinkedList(head);

        while (listNode != null) {
            System.out.println("listNode.val = " + listNode.val);
            listNode = listNode.next;
        }

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
