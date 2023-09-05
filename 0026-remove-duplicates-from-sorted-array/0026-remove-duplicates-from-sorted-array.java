class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        // 1. 중복되지 않은 값을 리스트에 담는다.
        // 2. 리스트에 담긴 값만 배열 처음부터 재선언한다.
        // 3. size는 리턴값, 배열에는 distinct된 값만 선언. 그 뒤의 값은 무시된다.
        for(int i=0; i<nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}