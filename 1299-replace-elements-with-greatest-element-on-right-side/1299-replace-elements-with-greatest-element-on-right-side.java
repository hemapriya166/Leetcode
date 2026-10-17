class Solution {
    public int[] replaceElements(int[] arr) {
        int res1[]=new int[arr.length];
        int max=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            max=0;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(arr[j],max);
            
            }
            res1[k]=max;
            k++;
            res1[res1.length-1]=-1;
    
        }
        return res1;
    }
}