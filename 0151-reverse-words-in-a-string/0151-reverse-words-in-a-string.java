class Solution {
    public String reverseWords(String s) {
        // 1. 문자열을 " "로 split
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=sArr.length-1; i>=0; i--) {
            String str = sArr[i];
        // 2. 뒤에서부터 문자열을 하나씩 붙힌다.
        
            if(str != "") {
                sb.append(str);
                // 3. 문자열 뒤에 공백 " "을 append해주고, 첫번째와 마지막 문자의 공백은 제외한다.
                if(i != 0) {
                    sb.append(" ");
                }
            }
            
        }
        
        // 4. 중간에 문자열이 완성되고, 남은 공백이 split되어있을 수 있어 완성된 후 마지막 공백을 제거한다.
        if(sb.charAt(sb.length()-1) == ' ') {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}