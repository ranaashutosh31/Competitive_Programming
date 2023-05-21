/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a Singly Linked List of size N, delete all alternate nodes of the list.

Example 1:
Input:
LinkedList: 1->2->3->4->5->6
Output: 1->3->5
Explanation: Deleting alternate nodes
results in the linked list with elements
1->3->5.

*/

class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        while(head!=null && head.next!=null){
            if(head.next.next==null){
                head.next = null;
            }
            else{
                head.next = head.next.next;
            }
            head = head.next;
        }
    }
}
