package linear.palindromelinkedlist;

import linear.ListNode;

import javax.swing.*;

public class PalindromeLinkedListMain {
    public static void main(String[] args) {
//        PalindromeLinkedList1 palindromeLinkedList = new PalindromeLinkedList1();
        PalindromeLinkedList2 palindromeLinkedList = new PalindromeLinkedList2 ();

        long start = System.nanoTime();

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        boolean bool = palindromeLinkedList.palindromeLinkedList(listNode);
        System.out.println("bool = " + bool);

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
