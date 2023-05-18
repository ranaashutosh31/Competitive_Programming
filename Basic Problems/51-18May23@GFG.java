/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given two Singly Linked List of N and M nodes respectively. The task is to check whether two linked lists are identical or not. 
Two Linked Lists are identical when they have same data and with same arrangement too.

Example 1:
Input:
LinkedList1: 1->2->3->4->5->6
LinkedList2: 99->59->42->20
Output: Not identical 

Example 2:
Input:
LinkedList1: 1->2->3->4->5
LinkedList2: 1->2->3->4->5
Output: Identical

*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node lastNode1 = head1;
        Node lastNode2 = head2;
        while(lastNode1!=null || lastNode2!=null){
            if(lastNode1.data!=lastNode2.data){
                return false;
            }
            lastNode1 = lastNode1.next;
            lastNode2 = lastNode2.next;
            if((lastNode1==null && lastNode2!=null) || (lastNode1!=null && lastNode2==null)){
                return false;
            }
        }
        return true;
    }
}
