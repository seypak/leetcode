class Solution {
    public int removeDuplicates(int[] nums) {
        
        // 1. 정렬이 되어있는 LinkedHashMap을 선언해 nums의 값을 카운팅한다. - 점차 증가하는 정렬된 nums라고 되어있어 이리 판단.
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int count = 0;
        // 2. map에 선언된 값만큼 nums에 key값을 넣어주는데
        for(Integer key : map.keySet()) {
            Integer value = map.get(key);
            // 2-1. 값이 있으므로 한번 삽입하고
            nums[count] = key;
            // 2-2. 2이상인경우는 한번 더 카운팅을 해준다.
            if(value >= 2) {
                nums[++count] = key;
            }
            count++;
        }
        return count;
    }
}