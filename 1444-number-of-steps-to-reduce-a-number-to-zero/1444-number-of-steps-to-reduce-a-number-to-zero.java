class Solution {
    public int numberOfSteps(int num) {
        // 1. 회차를 카운트한다.
        int count = 0;
        // 2. num이 0이될때까지
        while(num != 0) {
            // 3. 짝수면 2로나누고, 홀수면 1을 뺀다.
            if(num%2 == 0) {
                num = num/2;
            } else {
                num = num-1;
            }
            count++;
        }
        return count;
    }
}