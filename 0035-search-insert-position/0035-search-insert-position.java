class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int last = nums[len-1];
        if(last < target) {
            return len;
        }
        
        int index = 0;
        if(nums[len/2] < target) {
            for(int i=(len/2)+1; i<len; i++) {
                if(nums[i] == target || nums[i] == target+1) {
                    index = i;
                    break;
                } else if(nums[i] +1 == target) {
                    index = i+1;
                    break;
                }
            }
        } else {
            for(int i=0; i<=(len/2); i++) {
                if(nums[i] == target || nums[i] == target+1) {
                    index = i;
                    break;
                } else if(nums[i] +1 == target) {
                    index = i+1;
                    break;
                }
            }
        }
        return index;
    }
}