//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode newNode = new ListNode();
        newNode.next = head;
        ListNode curr = newNode;
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return newNode.next;
    }
}
