class Solution {
    public void moveZeroes(int[] nums) {
        // 1. 0을 제외한 오름차순으로 정렬시킨 리스트를 만든다.
        // 2. nums의 length만큼의 배열을 초기화시켜놓는다 ( 배열은 초기화하면 0으로 설정됨 )
        // 3. 1번에서 오름차순으로 정렬한 리스트를 0번부터 추가한다.
        //int[] result = new int[nums.length];
        //int[] temp = Arrays.stream(nums).filter(x -> x!=0).boxed().mapToInt(x -> x).toArray();
        //for(int i=0; i<temp.length; i++) {
            //result[i] = temp[i];
        //}
        //System.out.println(Arrays.toString(result));
        //nums = result;
        // Note : 배열의 복사본을 만들지 않고 이 작업을 제자리에서 수행해야 합니다.

        int index = 0;
        if(Arrays.stream(nums).anyMatch(x -> x == 0)) {
           for(int i=0; i<nums.length; i++) {
                if(nums[i] == 0) {
                    continue;
                }
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }     
        }
    }
}