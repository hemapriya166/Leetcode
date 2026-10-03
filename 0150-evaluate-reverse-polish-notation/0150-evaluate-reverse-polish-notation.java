class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        int num=0;
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+")&&!tokens[i].equals("*")&&!tokens[i].equals("/")&&!tokens[i].equals("-")){

                num=Integer.parseInt(tokens[i]);
            }
            
            if(stack.isEmpty()){
                
                stack.push(num);
            }
            else if(tokens[i].equals("+")){
                if(!stack.isEmpty()){
                int a=stack.pop();
                 int b=stack.pop();
                stack.push(a+b);
                }
               
            }
            else if(tokens[i].equals("-")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                     int b=stack.pop();
                     stack.push(b-a);
                }
            }
            else if(tokens[i].equals("/")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b/a);
                }
            }
            else if(tokens[i].equals("*")){
                if(!stack.isEmpty()){
                  int a=stack.pop();
                  int b=stack.pop();
                  stack.push(a*b);
                }
            }
            else{
                stack.push(num);
            }
        }
        return stack.peek();
        
    }
}