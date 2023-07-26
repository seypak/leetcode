class Solution {
    public int[] runningSum(int[] nums) {
        
        if(nums.length <= 1) {
            return nums;
        }
        
        int[] result = new int[nums.length];
        
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            count = count + nums[i];
            result[i] = count;
        }
        return result;
    }
}