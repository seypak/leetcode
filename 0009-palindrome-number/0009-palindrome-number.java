class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        String reverseStr = sb.reverse().toString();
        if(str.equals(reverseStr)) {
            return true;
        } else {
            return false;
        }
    }
}