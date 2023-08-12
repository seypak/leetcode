class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map2.put(arr[i], map2.getOrDefault(arr[i], 0)+1);
        }

        for(Integer key : map.keySet()) {
            Integer value = map.get(key);
            map2.remove(key);
            if(map2.containsValue(value)) {
                return false;
            } else {
                map2.put(key, value);
            }
        }
        return true;
    }
}