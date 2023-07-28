class Solution {
    public int lengthOfLastWord(String s) {
        
        String result = "";
        String[] sArr = s.split(" ");
        for(int i=sArr.length-1; i>=0; i--) {
            if("".equals(sArr[i])) {
                continue;
            } else {
                result = sArr[i];
                break;
            }
        }
        return result.length();
    }
}