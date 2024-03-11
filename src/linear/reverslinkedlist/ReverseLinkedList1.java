package linear.reverslinkedlist;

import linear.ListNode;

/**
 * 재귀 구조로 뒤집기
 */
public class ReverseLinkedList1 {

    public ListNode reverseLinkedList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode node, ListNode prev) {
        //현재 노드가 null이면 리턴
        if (node == null) {
            return prev;
        }

        //현재 노드의 다음 노드를 next 변수에 저장
        ListNode next = node.next;
        //현재 노드의 이전 노드를 next에 저장
        node.next = prev;

        //재귀
        return reverse(next, node);
    }
}
