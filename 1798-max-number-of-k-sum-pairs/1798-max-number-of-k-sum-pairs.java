class Solution {
    

    public int maxOperations(int[] nums, int k) {
        // 3일때, 3:1
        // 1일때, 3:1, 1:1
        // 3일때, 6-3인 3이 있으니 value == 0이 되면 key를 삭제
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(k-nums[i])) {
                count++;
                if(map.get(k-nums[i]) - 1 == 0) {
                    map.remove(k-nums[i]);
                } else {
                    map.put(k-nums[i], map.get(k-nums[i]) - 1);
                }
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}