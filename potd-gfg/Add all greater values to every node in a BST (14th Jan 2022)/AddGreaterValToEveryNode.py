#User function Template for python3

'''
# Tree Node
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None
'''

# modify the BST and return its root
def modify(root):
   
    global S 
    S = 0
    aagvtenibst(root)
    
    return root
    
def aagvtenibst(root):
    global S
    if root:
        
        # First recur on left child
        aagvtenibst(root.right)
        
        S += root.data
        root.data = S
       
        # now recur on right child
        aagvtenibst(root.left)
