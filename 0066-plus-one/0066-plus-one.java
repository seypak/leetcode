import java.math.*;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder digitSb = new StringBuilder();
        for(int i=0; i<digits.length; i++) {
            digitSb.append(String.valueOf(digits[i]));
        }
        BigDecimal bigNumber = new BigDecimal(digitSb.toString());
        String resultStr = String.valueOf(bigNumber.add(BigDecimal.valueOf(1)));
        int[] result = new int[resultStr.length()];
        for(int i=0; i<resultStr.length(); i++) {
            result[i] = Character.getNumericValue(resultStr.charAt(i));
        }
        return result;
    }
}