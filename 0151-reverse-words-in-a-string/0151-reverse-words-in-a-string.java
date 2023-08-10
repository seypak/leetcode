class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=sArr.length-1; i>=0; i--) {
            String str = sArr[i];

            if(str != "") {
                sb.append(str);
                if(i != 0) {
                    sb.append(" ");
                }
            }
            
        }
        
        if(sb.charAt(sb.length()-1) == ' ') {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}