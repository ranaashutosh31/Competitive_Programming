/*
PROBLEM SOLUTION IN EXTENDED DESCRIPTION
Given a single linked list of size M, your task is to complete the function sumOfLastN_Nodes(), which should return the sum of last N nodes of the linked list.

Input:
The function takes two arguments as input, the reference pointer to the head of the linked list and the an integer N.
There will be T test cases and for each test case the function will be called seperately.

Output:
For each test case output the sum of last N nodes of the linked list.

Constraints:
1<=T<=100
1<=N<=M<=1000

Example:
Input:
2
6 3
5 9 6 3 4 10
2 2
1 2
Output:
17
3

Explanation:
Testcase 1: Sum of last three nodes in the linked list is 3 + 4 + 10 = 17.
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      Node lastNode = head;
      int sum=0,count=0;
      while(lastNode!=null){
          count++;
          lastNode = lastNode.next;
      }
      int diff = count - k,ncount=0;
      Node endNode = head;
      while(endNode!=null){
          ncount++;
          if(ncount>diff){
              sum+=endNode.data;
              diff++;
              k++;
          }
          endNode=endNode.next;
      }
      return sum;
    }
}
