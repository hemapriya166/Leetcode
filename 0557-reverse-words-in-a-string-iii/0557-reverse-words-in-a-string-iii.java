class Solution {
    public String reverseWords(String s) {
        String s1="";
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
             for(int j=words[i].length()-1;j>=0;j--){
                char ch=words[i].charAt(j);
                s1+=ch;
                
             }
             if(i!=words.length-1){
                    s1+=" ";
                }

        }
        return s1;
        
    }
}