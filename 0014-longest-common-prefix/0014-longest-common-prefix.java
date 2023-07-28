class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }

        // 문자열 abc..z순으로 정렬.
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length-1];
        int len = first.length() < last.length() ? first.length() : last.length();
        
        for(int i=0; i<len; i++) {
            char f = first.charAt(i);
            char l = last.charAt(i);
            if(f == l) {
                result += f;
            } else {
                break;
            }
        }
        return result;
    }
}