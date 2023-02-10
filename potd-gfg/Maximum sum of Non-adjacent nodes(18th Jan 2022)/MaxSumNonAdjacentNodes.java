class Solution
{
    static HashMap<Node,Integer> hm=new HashMap<>();
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root)
    {
        // add your code here
        return maxSum(root);
    }
    
    static int maxSum(Node root){
        if(root==null)
            return 0;
        if(hm.containsKey(root))
            return hm.get(root);
        int  inclusion=root.data;
        if(root.left!=null){
            inclusion+=maxSum(root.left.left);
            inclusion+=maxSum(root.left.right);
        }
        
        if(root.right!=null){
            inclusion+=maxSum(root.right.left);
            inclusion+=maxSum(root.right.right);
        }
        
        int exclusion=maxSum(root.left)+maxSum(root.right);
        
        hm.put(root,Math.max(inclusion,exclusion));
        
        return hm.get(root);
    }
}
