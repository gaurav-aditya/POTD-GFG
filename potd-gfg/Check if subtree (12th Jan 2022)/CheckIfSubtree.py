'''
class Node:
    def _init_(self, val):
        self.right = None
        self.data = val
        self.left = None
'''
# your task is to complete this function
# function should print the left view of the binary tree
# Note: You aren't required to print a new line after every test case


class Solution:
    
    @staticmethod
    def isIdentical(T, S):      # Checks if the both trees are identical
        if (not T) and (not S):     # if both trees are empty it means they are identical
            return True
            
        if T and S:             # If both trees are not empty
        
            if (T.data == S.data) and Solution.isIdentical(T.left, S.left) and Solution.isIdentical(T.right, S.right):
                # If data of both tree is same
                # And if left subtree is identical
                # And if right subtree is identical
                # It simply means that, provided trees are identical
                return True
        
        return False                # If all of above conditions fails,
                                    # it means that one of the given tree is empty
                                    # hence both trees are not identical
                
    def isSubTree(self, T, S):
        
        if not S:               # If the S is empty tree
                                # it is a subtree of T
            return True
            
        if not T:               # If the T is empty, obviously S can't be the subtree
            return False
            
        if Solution.isIdentical(T, S):     # If both trees are identical, we can say S is subtree of T
            return True
        
        return Solution().isSubTree(T.left, S) or Solution().isSubTree(T.right, S)
        
        # If all of above conditions fails, 
        # we will check the same for left subtree and the right subtree with S
    