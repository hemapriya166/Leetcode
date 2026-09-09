class Solution {
    public void moveZeroes(int[] nums) {
        int[]num1=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                num1[j]=nums[i];
                j++;
            }
        }  
        for(int x=j;x<nums.length;x++){
                num1[x]=0;
            }
            
        for(int i=0;i<num1.length;i++){
            nums[i]=num1[i];
        }
        
        
            
    }
}