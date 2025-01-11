class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                k--;
            } 
            while(k<0){
                if(nums[i]==0){
                    k++;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        } 
        return max;
    }
}