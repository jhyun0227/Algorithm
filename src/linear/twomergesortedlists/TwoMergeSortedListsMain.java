package linear.twomergesortedlists;

import linear.ListNode;
import linear.trappingrainwater.TrappingRainWater2;

public class TwoMergeSortedListsMain {
    public static void main(String[] args) {
        TwoMergeSortedLists1 twoMergeSortedLists = new TwoMergeSortedLists1();

        long start = System.nanoTime();

        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode listNode = twoMergeSortedLists.twoMergeSortedLists(listNode1, listNode2);

        while (listNode != null) {
            System.out.println("listNode.val = " + listNode.val);
            listNode = listNode.next;
        }

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
