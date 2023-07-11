/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode revHead=null;
        ListNode lastNode=head;
        while(lastNode!=null){
            ListNode temp = lastNode.next;
            lastNode.next = revHead;
            revHead=lastNode;
            lastNode=temp;
        }
        return revHead;
    }
}
