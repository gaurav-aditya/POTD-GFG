
class Solution():
        
    def mergeHeaps(self, a, b, n, m):
        
        def heapify(arr, n, i):
            largest = i  
            l = 2 * i + 1  # left = 2*i + 1
            r = 2 * i + 2  # right = 2*i + 2
        
            if l < n and arr[l] > arr[largest]:
                largest = l
        
            if r < n and arr[r] > arr[largest]:
                largest = r
        
            if largest != i:
                arr[i], arr[largest] = arr[largest], arr[i]
                heapify(arr, n, largest)
        
        arr = a + b
        k = m + n
        for i in range(k//2 -1, -1, -1):
                heapify(arr, k, i)
        
        return arr
