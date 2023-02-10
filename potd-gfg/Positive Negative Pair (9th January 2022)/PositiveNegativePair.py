#User function Template for python3
# problem link https://practice.geeksforgeeks.org/problems/positive-negative-pair5209/1#

class Solution:
    #Function to return list containing all the pairs having both
    #negative and positive values of a number in the array.
    def findPairs(self,arr,n):
        # code here 
        st = set()
        res = []
        
        for i in arr:
            positive = abs(i)
            negative = -abs(i)
            if positive in st:
                res.extend([negative, positive])
            else:
                st.add(positive)
        return res
