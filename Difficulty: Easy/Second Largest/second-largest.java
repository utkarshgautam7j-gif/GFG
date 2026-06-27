class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=max){
                sec_max=arr[i];
            }
            
        }
         if (sec_max == Integer.MIN_VALUE) {
            return -1;
        }
        return sec_max;
        
    }
}