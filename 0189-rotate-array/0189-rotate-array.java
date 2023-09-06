class Solution {
    public void rotate(int[] nums, int k) {
        
        // 1. nums의 길이가 k와 같거나 2. k가 0이거나
        // 2. 1이거나 nums의 길이를 k로 나누었을때 0이면 배열 그대로 유지
        // (submit 실패로 - 추가) nums의 배열의 길이가 1개일때도 처리
        if(nums.length == k || k == 0 || (nums.length < k && nums.length%k == 0) || nums.length == 1) {
            return;
        }
        
        // 3. 배열보다 큰 숫자는 나머지로 처리한다.
        int rotate = k > nums.length ? k%nums.length : k;


        // 4. nums의 복사 배열을 만든 다.
        List<Integer> list = new LinkedList<Integer>();
        int[] temp = nums.clone();
        for(int i=0; i<temp.length; i++) {
            int step = temp.length-rotate+i;
            if(step >= temp.length) {
                step -= temp.length;
            }
            // 5. 변경되지 않을 복사본 temp의 인덱스번호를 nums에 삽입한다.
            nums[i] = temp[step];
        }
    }
}