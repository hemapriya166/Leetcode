class Solution {
    public String mergeAlternately(String word1, String word2) {
        int start=0;
        int end=0;
        String s1="";
        while(start<word1.length()&&end<word2.length()){
            s1+=word1.charAt(start);
            s1+=word2.charAt(end);
            start++;
            end++;
        }
        while(start<word1.length()){
            s1+=word1.charAt(start);
            start++;
        }
        while(end<word2.length()){
            s1+=word2.charAt(end);
            end++;
        }
        return s1;
          
    }
}