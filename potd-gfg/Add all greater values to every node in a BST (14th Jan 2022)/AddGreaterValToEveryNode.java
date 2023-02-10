class Solution{
    int sum=0;
    // modify the BST and return its root
    public Node modify(Node root)
    {
        //Write your code here
        addGreater(root);
        return root;
    }
    
    public void addGreater(Node root){
        if(root==null)
            return;
        addGreater(root.right);
        int data=root.data;
        root.data+=sum;
        sum+=data;
        addGreater(root.left);
        
    }
    
}
