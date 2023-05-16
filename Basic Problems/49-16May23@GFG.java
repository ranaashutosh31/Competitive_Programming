/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd() which contains head of the linked list and check whether the length of linked list is even or odd.
*/
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
/* isLengthEvenorOdd method should return 0 if the length of LL is even 
   otherwise return 1.*/
class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    int count=0;
	    Node lastNode = head1;
	    while(lastNode!=null){
	        count++;
	        lastNode = lastNode.next;
	    }
	    return count%2==0?0:1;
	}
}
