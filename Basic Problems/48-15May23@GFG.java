/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a linked list. Print all the elements of the linked list.

Note :- End of Line is handled by driver code itself. You just have to end with a single space.

Example 1:
Input:
N=2
LinkedList={1 , 2}
Output:
1 2
Explanation:
The linked list contains two 
elements 1 and 2.The elements 
are printed in a single line.
*/

class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        Node lastNode = head;
        while(lastNode!=null){
            System.out.print(lastNode.data + " ");
            lastNode = lastNode.next;
        }
    }
}
