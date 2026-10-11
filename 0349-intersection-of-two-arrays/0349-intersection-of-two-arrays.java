class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>res=new HashSet<>();
        HashSet <Integer>res2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
                   res.add(nums1[i]);
                }
        for(int j=0;j<nums2.length;j++){
            if(res.contains(nums2[j])){
                res2.add(nums2[j]);
            }
        }    
        
        int arr[]=new int[res2.size()];
        int k=0;
        for(int num:res2){
            arr[k]=num;
            k++;
        }
        return arr;
    }
    
}