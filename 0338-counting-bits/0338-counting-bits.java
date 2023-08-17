class Solution {
    public int[] countBits(int n) {
        
        // 1. 0부터 n까지 for문을 돌려 해당 index를 바이너리문자열로 변환한다.
        // 2. 바이너리문자열은 1 혹은 0만 있으므로 문자열을 체크해 더한값을 배열 result에 담는다.
        int[] result = new int[n+1];
        for(int i=0; i<=n; i++) {
            String binaryStr = Integer.toBinaryString(i);
            int count = 0;
            for(int j=0; j<binaryStr.length(); j++) {
                char c = binaryStr.charAt(j);
                if(c == '1') {
                    count += 1;
                }
            }
            result[i] = count;
        }
        return result;
    }
}