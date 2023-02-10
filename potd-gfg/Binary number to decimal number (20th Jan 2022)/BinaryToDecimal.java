class Solution
{
    public int binary_to_decimal(String str)
    {
        int n=str.length();
        int decimal=0;
        int pow=1;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                decimal+=pow;
            }
            pow<<=1;
        }
        return decimal;
        
    }
}
