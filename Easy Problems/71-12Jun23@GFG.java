/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

Example 1:
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 
2 ->2 -> 4-> 5, only 2 occurs more 
than 1 time.
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	Node temp=head;
	while(temp!=null && temp.next!=null){
	    if(temp.data!=temp.next.data){
	        temp=temp.next;
	    }
	    else{
	        temp.next=temp.next.next;
	    }
	}
	return head;
    }
}
