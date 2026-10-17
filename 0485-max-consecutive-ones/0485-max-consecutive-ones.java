class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        int i=0;
         while(i<nums.length){
            if(nums[i]==1){
            count++;
            max=Math.max(count,max);
            i++;
         }
         else{
            i++;
            count=0;
         }
         }
    
       
        return max;
        
    }
}