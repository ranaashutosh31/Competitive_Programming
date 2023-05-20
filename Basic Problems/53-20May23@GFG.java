/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a linked list of size N and a key. The task is to insert the key in the middle of the linked list.

Example 1:
Input:
LinkedList = 1->2->4
key = 3
Output: 1 2 3 4
Explanation: The new element is inserted
after the current middle element in the
linked list.
*/

class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node lastNode = head;
        int count=0;
        while(lastNode!=null){
            count++;
            lastNode = lastNode.next;
        }
        int i=1,mid=0;
        if(count%2==0){
            mid=count/2;
        }
        else{
            mid=(count/2)+1;
        }
        Node midNode = head;
        while(i<mid+1){
            if(i<mid){
                midNode = midNode.next;
            }
            if(i==mid){
                Node newNode = new Node(data);
                newNode.next = midNode.next;
                midNode.next = newNode;
                break;
            }
            i++;
        }
        return head;
    }
}
