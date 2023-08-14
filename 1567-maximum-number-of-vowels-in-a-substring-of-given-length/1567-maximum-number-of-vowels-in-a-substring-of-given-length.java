class Solution {
    public int maxVowels(String s, int k) {
        String vowel = "aeiou";
        
        int count =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++) {
            String sStr = String.valueOf(s.charAt(i));
            sb.append(sStr);
            if(vowel.contains(sStr)) {
                count++;
            }
        }

        int max = count;
        // length: 9 , k: 3일때 => 6에서 stop
        for(int i=k; i<s.length(); i++) {
            String sStr = String.valueOf(s.charAt(i));
            sb.append(sStr);

            String leftStr = String.valueOf(sb.charAt(0));
            String rightStr = String.valueOf(sb.charAt(k));
            if(vowel.contains(leftStr)) {
                count--;
            }
            sb.deleteCharAt(0);
            if(vowel.contains(rightStr)) {
                count++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}