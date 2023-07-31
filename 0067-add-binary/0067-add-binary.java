import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger aBI = new BigInteger(a, 2);
        BigInteger bBI = new BigInteger(b, 2);
        BigInteger sum = aBI.add(bBI);
        return sum.toString(2);
    }
}