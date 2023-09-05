class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<Integer>();
        // 1. val값과 같지 않은 값을 리스트에 추가한다.
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                list.add(nums[i]);
            }
        }
        // 2. list에 담긴만큼 배열의 첫번재인자부터 변경한다.
        for(int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }

        // 3. list의 사이즈를 리턴한다.
        return list.size();
    }
}