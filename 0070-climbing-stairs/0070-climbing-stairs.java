class Solution {
    public int climbStairs(int n) {
        //n=1
        // 1
        //n=2
        //2
        //n=3
        //3
        //n=4
        //1+1+1+1
        //1+1+2
        //1+2+1
        //2+1+1
        //2+2
        //5
        //n=5 
        //1+1+1+1+1
        //1+1+1+2
        //1+1+2+1
        //1+2+1+1
        //2+1+1+1
        //1+2+2
        //2+1+2
        //2+2+1
        //8
        // 피보나치 수열 n-2 + n-1 = n
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        
        // 3 - 1+2
        // 4 - 2+3
        // 5 - 3+5
        // 6 - 5+8

        int a = 1;
        int b = 2;
        int result = 0;
        for(int i=3; i<=n; i++) {
            result = a+b;
            a = b;
            b = result;
        }
        return result;
    }
}