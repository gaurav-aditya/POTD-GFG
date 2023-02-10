
'''
Function Arguments :
		@param  : q ( given queue to be used), k(Integer )
		@return : list, just reverse the first k elements of queue and return new queue
'''

#Function to reverse first k elements of a queue.
def modifyQueue(q,k):
    # code here
    temp = list()
    n = len(q)
    
    for _ in range(k):
        temp.append(q.pop(0))
        
    for _ in range(k):
        q.append(temp.pop())
        
    for _ in range(n-k):
        q.append(q.pop(0))
    
    return q
    # return q[:k][::-1] + q[k:]
    # Alternative way to solve this problem in python