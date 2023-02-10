Problem Link: 
https://practice.geeksforgeeks.org/problems/positive-negative-pair5209/1

class Solution
{
    public static ArrayList<Integer>findPairs(int arr[], int n) 
        { 
            // code here.
            ArrayList<Integer> ans=new ArrayList<Integer>();
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<n;i++){
                if(hs.contains(Math.abs(arr[i]))){
                    ans.add(-Math.abs(arr[i]));
                    ans.add(Math.abs(arr[i]));
                }
                hs.add(Math.abs(arr[i]));
            }

            return ans;
        }
}
