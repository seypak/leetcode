class Solution {
    public boolean increasingTriplet(int[] nums) {
        //1. 길이가 3개 미만이면 false
        if(nums.length < 3) {
            return false;
        }
        //2. 연속된 숫자 3개인지, 건너뛴 인덱스의 추출값이 true인지 submit 확인 ( 아님 )
        //3. [20,100,10,12,5,13] 인 경우에도 true
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            if(first >= num) {
                first = num;
            } else if(second > num) {
                second = num;
            } else if(second < num) {
                return true;
            }
        }
        return false;
    }
}