class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>res=new Stack<>();
        int []res1=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++ ){
            if(res.size()==0||temperatures[res.peek()]>temperatures[i]){
                res.push(i);
            }
            else{
                while(res.size()>0&&temperatures[res.peek()]<temperatures[i]){
                    int last=res.pop();
                    res1[last]=i-last;
                }
            }
            res.push(i);
        

        }
        return res1;
    }
}