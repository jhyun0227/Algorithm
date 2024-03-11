package linear.reverslinkedlist;

import linear.ListNode;

public class ReverseLinkedList2 {

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode node = head;

        while (node != null) {
            //next 변수에 현재 노드의 다음 노드를 저장
            ListNode next = node.next;
            //현재 노드의 다음 값을 이전 노드로 저장
            node.next = prev;
            //prev 변수에 현재 노드를 저장
            prev = node;
            //노드에 다음 노드를 저장
            node = next;
        }

        return prev;
    }
}
