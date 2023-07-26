class Solution {
    public int[] runningSum(int[] nums) {
       
       int count = 0;
       int[] result = new int[nums.length];
       for(int i=0; i<nums.length; i++){
           count +=nums[i];
           result[i] = count;
       } 
       return result;
    }
}