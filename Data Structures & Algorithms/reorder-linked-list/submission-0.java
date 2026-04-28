/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode last = slow.next;
        ListNode prev =null;
        slow.next =null;
        while(last!=null){
            ListNode tmp = last.next;
            last.next =prev;
            prev = last;
            last = tmp;
        }

        ListNode first =head;
        ListNode second = prev;
        while(second!=null){
            ListNode tmp1=first.next;
            ListNode tmp2= second.next;
            first.next = second;
            second.next = tmp1;
            first= tmp1;
            second = tmp2;
        }
    }
}
