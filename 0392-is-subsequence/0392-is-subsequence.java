class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<s.length(); i++) {
            String sStr = String.valueOf(s.charAt(i));
            // 1. s 문자열을 한글자씩 t에 포함되어있는지 확인한다.
            // 2. 포함되어있지 않으면 바로 false로 break.
            if(!t.contains(sStr)) {
                return false;
            } else {
                // (실패1) 3. 포함되어있다면 첫글자 순서대로 되어야하므로 index를 저장한다.
                int presentIndex = t.indexOf(sStr, index);
                // 4. 앞에서 저장된 index보다 뒤에거가 작으면 false
                if(index > presentIndex) {
                    return false;
                }
                index = presentIndex;
            }
            map.put(sStr, map.getOrDefault(sStr, 0) +1);
        }

        Map<String, Integer> tmap = new HashMap<String, Integer>();
        for(int i=0; i<t.length(); i++) {
            String sStr = String.valueOf(t.charAt(i));
            tmap.put(sStr, tmap.getOrDefault(sStr, 0) +1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) > tmap.get(key)) {
                return false;
            }
        }

        return true;
    }
}