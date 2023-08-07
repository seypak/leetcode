class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        
        int result = 0;
        for(Integer key : map.keySet()) {
            Integer value = map.get(key);
            if(value == 1){ 
                result = key;
                break;
            }
        }
        return result;
    }
}