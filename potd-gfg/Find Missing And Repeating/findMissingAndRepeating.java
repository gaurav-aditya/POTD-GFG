//1st Method: using occurence array
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here  1 3 3       1   2
        //                  occ 0 1 2 3
        int[] occ=new int[n+1];
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            occ[arr[i]]++;
        }
        for(int j=1;j<=n;j++){
            if(occ[j]==2)
                res[0]=j;
            if(occ[j]==0)
                res[1]=j;
        }
        return res;
    }
}
