class Solution {
    public int majorityElement(int[] nums) {
        int num=nums.length/2;
        int count =1;
        int major=0;
        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                
               

            }
            if(count>num){
                    major=nums[i];
                    return major;
                }
        }
        
        return major;
    }
}