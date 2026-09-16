class Solution {
    public int searchInsert(int[] nums, int target) {
        int num=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                num=i;
                break;
            }
            else if(nums[i]>target){
                num=i;
                break;
            }
        }
        return num;
    }
}