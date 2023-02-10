class Complete{
    // Function for finding maximum and value pair
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        int res = Integer.MAX_VALUE , sum = 0;
        
        for(int i = n-1 ; i >= 0 ; i--){
            
           int hi = Integer.MIN_VALUE;
            
           for(int j = 0 ; j < m ; j++){
               
               if(arr[i][j] < res){
                   
                   hi = Math.max(hi , arr[i][j]);
               }
            }
          
            if(hi == Integer.MIN_VALUE ){
                   return 0;
            }
               
            res = hi;
            sum += res;
        }
        
        return sum;
    }
