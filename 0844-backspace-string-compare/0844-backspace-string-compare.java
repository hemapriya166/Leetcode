class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack=new Stack<>();
        Stack<Character>stack1=new Stack<>();
        String s1="";
        String s2="";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
             if(ch=='#'){
                if(!stack.isEmpty()){
                stack.pop();
                }
                
            }
            else{
                stack.push(ch);
            }
        }
            for(int i=0;i<stack.size();i++){
                s1+=stack.get(i);
            }
        
        for(int i=0;i<t.length();i++){
            char ch1=t.charAt(i);
            
             if(ch1=='#'){
                if(!stack1.isEmpty()){
                stack1.pop();
                }
            }
            else{
                stack1.push(ch1);
            }
        }
        for(int j=0;j<stack1.size();j++){
            s2+=stack1.get(j);
        }
        if(s1.equals(s2)){
            return true;
        }
    
        return false;
    }
}