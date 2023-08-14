class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 1. 첫번째 0,1,2,3 = k인덱스만큼 합을 구한다
        // ex) i=1일때, 1,2,3,4
        // ex) i=2일때, 2,3,4,5
        double count = 0;
        for(int i=0; i<k; i++) {
            count += nums[i];
        }
        
        double max = count;
        for(int i=1; i+k-1<nums.length; i++) {
            count -= nums[i-1];    
            count += nums[i+k-1];
            max = Math.max(max, count);
        }
        return max/k;
    }
}