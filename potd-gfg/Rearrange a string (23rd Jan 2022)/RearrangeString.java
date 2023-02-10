class Solution
{
    public String arrangeString(String s)
        {
            StringBuilder res=new StringBuilder();
            int[] char_count=new int[26];
            int sumOfDigits=0;
            for(int i=0;i<s.length();i++){
                if(Character.isUpperCase(s.charAt(i))){
                    char_count[s.charAt(i)-'A']++;
                }
                else
                    sumOfDigits+=s.charAt(i)-'0';
            }
            
            for(int i=0;i<26;i++){
                char ch=(char)('A'+i);
                while(char_count[i]-->0){
                    res.append(ch);
                }
            }
            
            if(sumOfDigits>0)
                res.append(sumOfDigits);
                
            return res.toString();
            
        }
}
