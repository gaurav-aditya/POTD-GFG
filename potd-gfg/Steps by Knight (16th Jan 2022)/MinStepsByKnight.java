class Solution
{
    static class Pair {
        int first;
        int second;
        
        Pair(int a,int b) {
            first = a;
            second = b;
        }
    }
    
    static boolean isValid(int x,int y,int n)
    {
        if(x<n && x>=0 && y<n && y>=0) {
            return true;
        }
        
        return false;
    }
    
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int startX = KnightPos[0]-1, startY = KnightPos[1]-1, endX = TargetPos[0]-1, 
        endY = TargetPos[1]-1;
        Queue<Pair> queue = new LinkedList<>();
        boolean visited[][]= new boolean[N][N];
        queue.add(new Pair(startX, startY));
        visited[startX][startY] = true;
        
        int count=0;
        int arr[][]={ {1,2},{-1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,1},{-2,-1} };
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i<size;i++) {
                Pair pair = queue.poll();
                int x = pair.first, y = pair.second;
                if(x == endX && y == endY) {
                    return count;
                }
                
                for(int j = 0; j < arr.length; j++) {
                    int x1 = x + arr[j][0];
                    int y1 = y +arr[j][1];
                    if(isValid(x1,y1,N) && !visited[x1][y1]) {
                        visited[x1][y1]=true;
                        queue.add(new Pair(x1,y1));
                    }
                }
            }
            
            count++;
        }
        
        return count;
    }
}
