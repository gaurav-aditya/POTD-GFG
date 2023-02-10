class Tree{
    Node dll,pointer;
        
    // return the head of the DLL and remove those node from the tree as well.
    public Node convertToDLL(Node root)
    {
        // Code here
        toDll(root);
        return dll;
        
    }
    
    Node toDll(Node root){
    if(root == null)
            return null;
    if(root.left==null && root.right==null)
    {
            if(dll==null){
                dll=new Node(root.data);
                pointer=dll;
            }
            else{
                pointer.right=new Node(root.data);
                pointer.right.left=pointer;
                pointer=pointer.right;
            }
            return null;
            
    }
        root.left=toDll(root.left);
        root.right=toDll(root.right);
        return root;
    }
}
