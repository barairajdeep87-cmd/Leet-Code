class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int n=nums.length;
        int a[]=new int [2];
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
            sum=nums[i]+nums[j];
            if(sum==target && i!=j){
             a[0]=i;
             a[1]=j;
            }
          }
        }
        return a;
    
    }
}