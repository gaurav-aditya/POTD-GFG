class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        if(st.size()==0)
            return;
        int ele=st.pop();
        clonestack(st,cloned);
        cloned.push(ele);
    }
}
