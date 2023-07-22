package org.example;

public class Main {


    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        reverse(head);

        System.out.println(head.val);

    }

    private static void reverse(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head, fast = head.next;

        while (fast != null) {
            ListNode tmp = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = slow.next.next;
            fast = tmp;
        }
    }

}