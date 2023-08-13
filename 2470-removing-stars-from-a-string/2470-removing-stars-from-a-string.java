class Solution {
    public String removeStars(String s) {
        // 1. *이 아닐때 문자열을 insert한다.
        // 2. *이 나오면 마지막 문자열을 삭제한다.
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '*') {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(String.valueOf(c));
            }
        }
        return sb.toString();
    }
}