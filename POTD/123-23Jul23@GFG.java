/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:
Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.
*/

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node lastNode = head;
        Node h0 = new Node(0); Node h1 = new Node(1); Node h2 = new Node(2); 
        Node l0 = h0; Node l1 = h1; Node l2 = h2;
        while(lastNode!=null){
            if(lastNode.data==0){
                l0.next = lastNode;
                l0 = l0.next;
            }
            else if(lastNode.data==1){
                l1.next = lastNode;
                l1 = l1.next;
            }
            else if(lastNode.data==2){
                l2.next = lastNode;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }
        l0.next = (h1.next!=null)?h1.next:h2.next;
        l1.next = h2.next;
        l2.next=null;
        return h0.next;
    }
}
