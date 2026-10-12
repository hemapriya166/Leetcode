class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int digit=0;
        int temp=0;
        int tempcount=0;
        for(int i=0;i<nums.length;i++){
           String ch=String.valueOf(nums[i]);
           int len=ch.length();
           if(len%2==0){
            count++;
           }
        }
        
       
        return count;
    }
}