#User function Template for python3

'''

class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
'''

class Solution:
    def addOne(self,head):
        #Returns new head of linked List.
        num = ""
        temp = head
        while head.next != None:
            num += str(head.data)
            head = head.next
        num += str(head.data)
        num = int(num) + 1

        temp.next = None
        temp.data = num
        return temp
