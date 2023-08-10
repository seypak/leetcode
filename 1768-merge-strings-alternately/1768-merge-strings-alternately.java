class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int word1Len = word1.length();
        int word2Len = word2.length();
        
        // 1. 길이가 작은 것 기준으로 번갈아가며 문자열을 만든다.
        // 2. 작은게 끝나고 나면 작은것의 length ~ 긴거 끝까지 붙힌다.
        int len = 0;
        String longStr = "";
        if(word1.length() > word2.length()) {
            len = word2.length();
            longStr = word1;
        } else {
            len = word1.length();
            longStr = word2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++) {
            String word1Str = String.valueOf(word1.charAt(i));
            String word2Str = String.valueOf(word2.charAt(i));
            sb.append(word1Str).append(word2Str);
        }
        
        for(int i=len; i<longStr.length(); i++) {
            String word = String.valueOf(longStr.charAt(i));
            sb.append(word);
        }
        return sb.toString();
    }
}