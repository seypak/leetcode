class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        if(s.length() == 1) {
            return 1;
        }

        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<Character>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, i-left+1);
            } else {
                while(set.contains(c)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(c);
            }
        }   
        return maxLength;
    }
}