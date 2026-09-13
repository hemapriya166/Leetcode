class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]arr1=new int[nums.length];
        int start=0;
        int end=n;
        int k=0;
        for(int i=0;i<n;i++){
            arr1[k]=nums[start];
            k++;
            arr1[k]=nums[end];
            k++;
            start++;
            end++;

        }
        
        return arr1;
        
    }
}