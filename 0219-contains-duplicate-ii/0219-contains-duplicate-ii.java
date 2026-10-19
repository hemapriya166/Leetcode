class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int res=0;
        Set<Integer> s1 = new HashSet<>();
        if(nums.length==1){
            return false;
        }
        

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                s1.remove(nums[i - k - 1]);
            }

            if (s1.contains(nums[i])) {
                return true;
            }

            s1.add(nums[i]);
        }

        return false;
    }
}
