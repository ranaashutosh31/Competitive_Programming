/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head.next;
        ListNode prev = head;
        ListNode next = null;
        while(curr!=null){
            if(curr.val==prev.val){
                prev.next=curr.next;
                curr = curr.next;
            }
            else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }
}
