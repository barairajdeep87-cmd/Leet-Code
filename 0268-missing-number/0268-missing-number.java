class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        while(n>0){
            sum=sum+n;
            n--;
        }
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
        } 
        return sum-sum1;
    }
}