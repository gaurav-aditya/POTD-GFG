class Solution {
    static int palindromepair(int N, String arr[]) {
        // code here
        HashMap<String,Integer>  hm=new HashMap<>();
        
        for(int i=0;i<N;i++){
            hm.put(arr[i],i);
        }
        
        for(int i=0;i<N;i++){
            String reversed=new StringBuilder(arr[i]).reverse().toString();
            if(hm.containsKey(reversed)){
                if(hm.get(reversed) != i)
                    return 1;
            }
            
        }
        
        for (int i = 0; i < N; i++){
            String cur = arr[i];
            for (int j = 1; j < cur.length(); j++) {
                String left = cur.substring(0, j);
                String right = cur.substring(j);
                
                if (isPalindrome(left)) {
                    String reverseRight = new StringBuilder(right).reverse().toString();
                    if (hm.containsKey(reverseRight)) {
                        return 1;
                    }
                }
                if (isPalindrome(right)) {
                    String reverseLeft = new StringBuilder(left).reverse().toString();
                    if (hm.containsKey(reverseLeft)) {
                        return 1;
                    }
                }
                
            }
        }
        
        return 0;
    }
    
    private static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while(i < j) {
            if (word.charAt(i++) != word.charAt(j--)) 
                return false;
        }
        return true;
    }
};
