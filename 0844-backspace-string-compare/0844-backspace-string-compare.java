class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(s1.length()>0){
                s1=s1.substring(0,s1.length()-1);
                
            }
            }
            else{
                s1+=ch;
            }
        }
        for(int j=0;j<t.length();j++){
            char ch1=t.charAt(j);
            
            if(ch1=='#'){
                if(s2.length()>0){
                s2=s2.substring(0,s2.length()-1);

            }
            }
            else{
                s2+=ch1;
            }
        }
        
        return s1.equals(s2);
        
    }
}