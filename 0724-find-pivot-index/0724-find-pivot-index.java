class Solution {
    public int pivotIndex(int[] nums) {
        
        // 현재 인덱스에서 좌측의 총합과 우측의 총합을 비교해야하기때문에
        // 그 방법으로 총합을 구해 좌측인덱스가 진행될때마다 좌측의 합을 구하고 좌측의 합과 현재 인덱스의 값을 더한게 우측의 총합으로 계산한다.
        // 1. 배열의 총합을 구한다.
        // 2. left는 배열을 진행함에 있어서 현재 값을 더해준다.
        // 3. 좌측의 합과 총합-좌측의합+현재인덱스값이 같아지면 break하고 현재 인덱스 반환.
        // 4. 없으면 for문이 종료되고 초기 선언한 index -1이 리턴.
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            total += nums[i];
        }

        int left = 0;
        int index = -1;
        for(int i=0; i<nums.length; i++) {
            if(left == total-(left+nums[i])) {
                index = i;
                break;
            }
            left+=nums[i];
        }
        return index;
    }
}