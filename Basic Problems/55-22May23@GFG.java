/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given head, the head of a singly linked list, find if the linked list is circular or not. A linked list is called circular if it not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.

Note: The linked list does not contains any inner loop.

Example 1:
Input:
LinkedList: 1->2->3->4->5
(the first and last node is connected,
i.e. 5 --> 1)
Output: 1

Example 2:
Input:
LinkedList: 2->4->6->7->5->1
Output: 0
*/

class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
        Node firstNode = head;
        Node lastNode = head.next;
        while(lastNode!=null){
            if(firstNode==lastNode){
                return true;
            }
            lastNode = lastNode.next;
        }
        return false;
    }
}
