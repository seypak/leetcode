class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z\\d]*", "");

        int len = str.length();
        
        boolean flag = true;
        for(int i=0; i<len; i++) {
            // len == 10
            // 0 9
            // 1 8
            // 2 7
            char start = str.charAt(i);
            char end = str.charAt(len-(i+1));
            if(start != end) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}