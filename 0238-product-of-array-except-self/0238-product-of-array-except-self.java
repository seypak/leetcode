class Solution {
    public int[] productExceptSelf(int[] nums) {

        // 1. 0을 제외한 총 곱연산을 구한다.
        // 2. 배열에 0이 있는지 확인한다.
        int total = 1;
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                total *= nums[i];
            } else {
                zeroCount += 1;
            }
        }
        
        int[] result = new int[nums.length];
        // 2-1. 추가) 배열에 0이 몇개가 있는지 확인한다.
        if(zeroCount > 1) {
            return result;
        }
        for(int i=0; i<nums.length; i++) {
            if(zeroCount > 0) {
                // 3. 배열에 0이 있다면 해당 인덱스가 0이아닌것은 전부 0, 0인것은 총 곱연산을 배열에 넣는다.
                if(nums[i] == 0) {
                    result[i] = total;
                } else {
                    result[i] = 0;
                }
            } else {
                // 4. 배열에 0이 없다면 인덱스별로 총 곱연산에서 해당 인덱스를 나눈값을 배열에 넣는다
                result[i] = total/nums[i];
            }
        }
        return result;
    }
}