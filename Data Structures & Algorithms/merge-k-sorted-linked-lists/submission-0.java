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
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len==0) return null;
        int interval =1;
        while(interval<len){
            for (int i=0;i<len - interval;i=i+(2*interval)){
                lists[i] = merge2list(lists[i],lists[i+interval]);
            }
            interval =interval*2;
        }
        return lists[0];

    }
    private ListNode merge2list(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr  =dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next =l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr = curr.next;
        }
        if(l1!=null){
            curr.next =l1;
        }else{
            curr.next = l2;
        }
        return dummy.next;
    }
}
