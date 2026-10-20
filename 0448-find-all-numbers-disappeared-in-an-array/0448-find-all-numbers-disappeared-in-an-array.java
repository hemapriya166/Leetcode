class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>res=new ArrayList<>();
        Set<Integer>dem=new HashSet<>();
        int a=nums.length;
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           dem.add(nums[i]);
       }
            for(int j=1;j<=a;j++){
                if(!dem.contains(j)){
                    res.add(j);
                }
                
            }
        return res;
    }
}