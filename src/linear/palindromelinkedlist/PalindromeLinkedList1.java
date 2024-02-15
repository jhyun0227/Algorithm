package linear.palindromelinkedlist;

import linear.ListNode;
import linear.threesum.ThreeSum2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList1 {

    public boolean palindromeLinkedList(ListNode listNode) {
        Deque<Integer> deque = new LinkedList<>();

        while (listNode != null) {
            deque.add(listNode.val);
            listNode = listNode.next;
        }

        boolean result = true;
        while (!deque.isEmpty() && deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                result = false;
            }
        }

        return true;
    }
}
