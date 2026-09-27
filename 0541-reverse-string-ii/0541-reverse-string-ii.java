class Solution {
    public String reverseStr(String s, int k) {
        
        char ch1[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int start=i;
            int end=Math.min(i+k-1,s.length()-1);
            while(start<end){
                char temp=ch1[start];
                ch1[start]=ch1[end];
                ch1[end]=temp;
                start++;
                end--;
            } 
            
        } 
        

        return new String(ch1);
    }
}