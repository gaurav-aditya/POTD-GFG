class Solution {
    public static boolean isSubtree(Node T, Node S) {
        if(S==null)
            return true;
        if(T==null)
            return false;
        if(isSame(T,S))
            return true;
        return (isSubtree(T.left,S) || isSubtree(T.right,S));
        
        }
    
    public static boolean isSame(Node T,Node S){
        if(T==null && S==null)
            return true;
        if(T!=null && S!=null){
            if(T.data==S.data && isSame(T.left,S.left) && isSame(T.right,S.right)){
                return true;
            }
        }
        return false;
    }
}
