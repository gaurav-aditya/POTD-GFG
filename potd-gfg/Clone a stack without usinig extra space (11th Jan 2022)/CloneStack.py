# problem link -> https://practice.geeksforgeeks.org/problems/clone-a-stack-without-usinig-extra-space/
class Solution:
    def clonestack(self, st, cloned):
        # code here
        while len(st):
            cloned.appendleft(st.pop())
        return cloned
