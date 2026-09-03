class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
        
            if("aeiouAEIOU".indexOf(ch[start])==-1){
                start++;
                continue;
            }
            if("aeiouAEIOU".indexOf(ch[end])==-1){
                end--;
                continue;
            }

            if("aeiouAEIOU".indexOf(ch[start])!=-1){
                if("aeiouAEIOU".indexOf(ch[end])!=-1){
                    char temp=ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                }
            
                
            
            }
            start++;
            end--;
        }
        return new String(ch);
        
    }
}