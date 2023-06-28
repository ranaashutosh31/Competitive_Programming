/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a binary tree, find its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
Input:
 root  -->     1
             /   \
            3     2
           /
          4           
Output: 3
Explanation:
Maximum depth is between nodes 1 and 4, which is 3.
*/

class Solution {
  public static int maxDepth(Node root) {
    // code here
    if(root == null) return 0;
    int leftSubtree = maxDepth(root.left);
    int rightSubtree = maxDepth(root.right);
    return Math.max(leftSubtree, rightSubtree)+1;
   }
}
