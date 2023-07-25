class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = 0;
        // 0 , 24 length
        // 1 , 4 length-1
        boolean flag = true;
        for(int i=0; i<nums.length-1; i++) {
            int standard = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                int next = nums[j];
                if(standard + next == target) {
                    left = i;        
                    right = j;
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                break;
            }
        }
        result[0] = left;
        result[1] = right;
        return result;
    }
}