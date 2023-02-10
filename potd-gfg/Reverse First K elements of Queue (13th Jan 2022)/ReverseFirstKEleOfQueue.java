class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        int n=q.size();
        revK(q,k,1);
        
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        return q;
    }
    
    public void revK(Queue<Integer> q, int k,int pointer){
        if(pointer>k)
            return;
        int ele=q.remove();
        revK(q,k,pointer+=1);
        q.add(ele);
    }
}
