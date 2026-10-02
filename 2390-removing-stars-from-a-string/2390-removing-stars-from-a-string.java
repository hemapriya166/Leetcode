class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();

        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        for(int j=0;j<stack.size();j++){
            s1.append(stack.get(j));
        }
        return s1.toString();
        
    }
}