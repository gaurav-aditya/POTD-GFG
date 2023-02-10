
class Solution:
        
        
    def palindromepair(self, N, arr):
        def isPalindrome(st):
            n = len(st)
            for i in range(n // 2):
                if (st[i] != st[n - i - 1]):
                    return False
        
            return True
            
        for i in range(len(arr) - 1):
            for j in range(i + 1, len(arr)):
                
                st = arr[i] + arr[j]
    
                if isPalindrome(st):
                    return 1
                st = arr[j] + arr[i]
                
                if isPalindrome(st):
                    return 1
        return 0