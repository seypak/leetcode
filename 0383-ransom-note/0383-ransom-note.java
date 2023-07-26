class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. ransomNote 문자열, count의 map을 만든다.
        // 2. magazine 문자열, count의 map을 만든다.
        // 3. ransomNote을 순차대로 문자열의 카운트보다 magazine 카운트가 더 크다면 답
        Map<Character, Integer> ransomNoteMap = new HashMap<Character, Integer>();
        for(int i=0; i<ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0)+1);
        }
        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        for(int i=0; i<magazine.length(); i++) {
            char c = magazine.charAt(i);
            magazineMap.put(c, magazineMap.getOrDefault(c, 0)+1);
        }

        boolean result = true;
        for(Character key : ransomNoteMap.keySet()) {
            Integer ransomNoteCount = (Integer) ransomNoteMap.get(key);
            Integer magazineCount = (Integer) magazineMap.get(key);
            if(magazineCount == null) {
                result = false;
                break;
            }
            if(ransomNoteMap.get(key) > magazineMap.get(key)) {
                result = false;
                break;
            }
        }
        return result;
    }
}