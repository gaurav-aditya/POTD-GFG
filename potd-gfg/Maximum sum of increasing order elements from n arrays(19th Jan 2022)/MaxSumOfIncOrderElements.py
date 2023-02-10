
def maximumSum (n, m, arr) : 
    ans = 0
    for i in range(n):
        arr[i].sort()
        # print(arr[i])
    
    def mx_lower_than_x(a, x):
        l = len(a)
        for j in range(l-1,-1,-1):
            if a[j] < x:
                return a[j]
        else:
            return False
    
    curr_mx = max(arr[n-1])
    ans += curr_mx
    for i in range(n-1,0,-1):
        prev_mx = mx_lower_than_x(arr[i-1],curr_mx)
        if prev_mx:
            if curr_mx < prev_mx:
                return 0
            else:
                ans += prev_mx
                curr_mx = prev_mx
        else:
            return 0
    
    return ans