class Solution {
    public int calPoints(String[] operations) {
        int []ch=new int[operations.length];
        int top=0;
        
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                top--;
            }
            else if(operations[i].equals("D")){
                ch[top]=ch[top-1]*2;
                top++;
            }
            else if(operations[i].equals("+")){
                ch[top]=ch[top-1]+ch[top-2];
                top++;

            }
            else{
               int num=Integer.parseInt(operations[i]);
                ch[top]=num;
                top++; 
            }

        }
        int sum=0;
        for(int i=0;i<top;i++){
            sum+=ch[i];
        }
        return sum;
    }
}