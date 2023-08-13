class Solution {
    public boolean closeStrings(String word1, String word2) {

        // 1. word1의 문자열 별로 count를 담는다
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<word1.length(); i++) {
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0)+1);
        }

        // 2. word2의 문자열 별로 count를 담는다
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i=0; i<word2.length(); i++) {
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }

        // 3. word1의 카운트만큼 word2의 카운트가 존재한다면 교체가 가능하므로 true
        // 4. 문자열 카운트가 중복될때 처리가 추가로 필요할것같은데.. run실행 후 로직추가 
        for(Character c : map.keySet()){
            Integer value = map.get(c);
            if(!map2.containsValue(value) || !map2.containsKey(c)) {
                return false;
            } else {
                for(Character c2 : map2.keySet()){
                    Integer value2 = map2.get(c2);
                    if(value2 == value) {
                        map2.put(c2, 0);
                        break;
                    }
                }
            }
        }
        return true;
    }
}