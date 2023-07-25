/*
PROBLEM LINK IN EXTEDED DESCRIPITION
Given a binary tree of size  N, a node, and a positive integer k., Your task is to complete the function kthAncestor(), the function should return the kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then return -1.
Note: It is guaranteed that the node exists in the tree.
*/

class Solution
{   public static void buildMap(Node root, Map<Integer , Integer> mp){
        if(root == null) return ;
        if(root.left != null){
            mp.put(root.left.data , root.data);
            buildMap(root.left , mp);
        } 
        if(root.right!= null){
            mp.put(root.right.data , root.data);
            buildMap(root.right , mp);
        }
    }
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        Map<Integer , Integer> mp = new HashMap();
        buildMap(root , mp);
        while( k != 0 && mp.containsKey(node)){
            node = mp.get(node);
            k--;
        }
        if( k == 0) return node;
        return -1;
    }
}
