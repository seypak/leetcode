class Solution {
    public int maximumWealth(int[][] accounts) {
        int result= 0;
        for(int i=0; i<accounts.length; i++) {
            int[] account = accounts[i];
            int count = 0;
            for(int j=0; j<account.length; j++) {
                count += account[j];
            }
            if(result < count) {
                result = count;
            }
        }
        return result;
    }
}