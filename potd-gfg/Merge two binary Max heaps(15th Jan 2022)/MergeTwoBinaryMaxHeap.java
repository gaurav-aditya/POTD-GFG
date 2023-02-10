class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int[] mergedHeaps=new int[m+n];
        for(int i=0;i<n;i++){
            mergedHeaps[i]=a[i];
        }
        
        for(int i=0;i<m;i++){
            mergedHeaps[i+n]=b[i];
        }
        
        int k=m+n;
        for(int i=(k/2)-1;i>=0;i--){
            maxHeapify(mergedHeaps,k,i);
        }
        
        return mergedHeaps;
    }
        public void maxHeapify(int[] arr,int k, int i){
            if(i>=k)
                return;
            int parent=i;
            int lChild=2*i+1;
            int rChild=2*i+2;
            
        if(lChild < k && arr[lChild] > arr[parent]){
            parent = lChild;
        }
        
        if(rChild < k && arr[rChild] > arr[parent]){
            parent = rChild;
        }
        
        if(parent != i){
            
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;
            maxHeapify(arr, k, parent);
        }
    }
}
