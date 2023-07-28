//PROBLEM LINK IN EXTENDED DESCRIPTION

class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.   
        int curr = root.data;
        if(root==null) return null;
        else if(n1>curr && n2>curr) return LCA(root.right, n1, n2);
        else if(n1<curr && n2<curr) return LCA(root.left, n1, n2);
        return root;
    }
    
}
