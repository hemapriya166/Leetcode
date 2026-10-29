class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        String s="";

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            int index=magazine.indexOf(ch);
            if(magazine.indexOf(ch)!=-1){
               if(index!=-1){ 
                s+=ch;
                magazine = magazine.substring(0, index)
                         + magazine.substring(index + 1);
            
               }
                
            }
        }
        if(s.equals(ransomNote)){
            return true;
        }
        return false;
    }
}