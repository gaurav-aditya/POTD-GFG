#User function Template for python3

'''
# Node Class:
class Node:
    def __init__(self,val):
        self.data = val
        self.left = None
        self.right = None
'''

from audioop import getsample


class Solution:
    
    def getMaxSum(self,root):
        def getSum(root):
            if not root:
                return 0

            dp = dict()
            if dp.get(root):
                return dp[root]
            
            include = root.data
            if root.left:
                include += getSum(root.left.left)
                include += getSum(root.left.right)
            
            if root.right:
                include += getSum(root.right.left)
                include += getSum(root.right.right)
            
            exclude = getSum(root.left) + getSum(root.right)
            dp[root] = max(include, exclude)
            
            return dp[root]
        return getSum(root)