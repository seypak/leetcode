class Solution {
    public int romanToInt(String s) {
        // s: "MCMXCIV"
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int before = 0;
        int count = 0;
        // 1. 뒤에서 부터 카운팅한다.
        // V -> I -> C -> X -> M -> C -> M
        for(int i=s.length()-1; i>=0; i--) {
            Integer current = map.get(s.charAt(i));
            if(before <= current) {
                count += current; // 3. 반대면 플러스한다.
            } else {
                count -= current; // 2. 앞선것보다 낮으면 해당 값은 마이너스한다.
            }
            before = current;
        }
        return count;
    }
}