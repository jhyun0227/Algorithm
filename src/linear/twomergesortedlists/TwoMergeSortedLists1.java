package linear.twomergesortedlists;

import linear.ListNode;

public class TwoMergeSortedLists1 {

    public ListNode twoMergeSortedLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = twoMergeSortedLists(list1.next, list2);
            return list1;
        } else {
            list2.next = twoMergeSortedLists(list1, list2.next);
            return list2;
        }
    }
}
