//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
    {
          //add code here.
        ArrayList<Node> list = new ArrayList<>();
        inorder(root, list);
        for(int i=0; i<list.size()-1; i++) {
            Node node = list.get(i);
            Node ans = list.get(i+1);
            if(node==x && ans!=null) {
                return ans;
            }
        }
        return null;  
    }
    public void inorder(Node root, ArrayList<Node> list) {
        if(root==null) {
            return;
        }
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
        
    }
}
