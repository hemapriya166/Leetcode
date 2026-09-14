class Solution {
    public int[] finalPrices(int[] prices) {
        int res[]=new int[prices.length];
        int k=0;
        for(int i=0;i<prices.length;i++){
            if(i==prices.length-1){
                res[k]=prices[i];
                k++;
            }
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                  res[k]=prices[i]-prices[j];
                  k++;
                  break;
        
                }
                else if(j==prices.length-1){
                    res[k]=prices[i];
                    k++;
                    break;
                 }   
                 
                
            }
            
           
                    
            
        }
        return res;
        
    }
}