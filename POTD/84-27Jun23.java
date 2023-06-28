/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given two linked lists, your task is to complete the function makeUnion(), which returns the union list of two linked lists. This union list should include all the distinct elements only and it should be sorted in ascending order.

Example 1:
Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 
1 2 3 4 6 8 9
Explanation: 
All the distinct numbers from two lists, when sorted form the list in the output. 
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	      ArrayList<Integer> al = new ArrayList<>();
        while(head1 != null){
            if(!al.contains(head1.data))
                al.add(head1.data);
            head1 = head1.next;
        }
        while(head2 != null){
            if(!al.contains(head2.data))
                al.add(head2.data);
            head2 = head2.next;
        }
        Collections.sort(al);
        Node Head = new Node(-1);
        Node curr = Head;
        for(int i=0; i<al.size(); i++){
            curr.next = new Node(al.get(i));
            curr = curr.next;
        }
        return Head.next;
	}
