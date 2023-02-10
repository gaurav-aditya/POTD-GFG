class Solution 
{ 
    int palindromeSubStrs(String str) { 
        int n=str.length();
        boolean[][] isPallindrome =new boolean[n][n];
        HashSet<String> hs =new HashSet<>();
        
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){
                if(gap==0){
                   isPallindrome[i][j]=true; 
                }
                else if(gap==1){
                    isPallindrome[i][j]=str.charAt(i)==str.charAt(j);
                 }
                else{
                    isPallindrome[i][j]=(str.charAt(i)==str.charAt(j) && isPallindrome[i+1][j-1]);
                   
                }
                if(isPallindrome[i][j])
                    hs.add(str.substring(i,j+1));
            }
            
        }
        return hs.size();
    }
} 
