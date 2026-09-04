class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String s1[]=s.split(" ");
        String last=s1[s1.length-1];
        return last.length();
    }
}