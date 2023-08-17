class Solution {
    public int tribonacci(int n) {
       // 0: 0
       // 1: 1
       // 2: 1
       // 3: 0+1+1=2
       // 4: 1+1+2=4
       // 5: 1+2+4=7
       // 1. 3부터 앞의 세자리 합을 구한다.
       // 2. 두번째값 -> 첫번재값 대입
       // 3. 세번째값 -> 첫번재값 대입
       // 4. 세자리의 합을 세번째값으로 주입 후 세번째값을 리턴
       if(n == 0) {
           return 0;
       }
       if(n == 1) {
           return 1;
       }
       if(n == 2) {
           return 1;
       }
       
       int first = 0;
       int second = 1;
       int third = 1;
       for(int i=2; i<n; i++) {
           int sum = first+second+third;
           first = second;
           second = third;
           third = sum;
       }
       return third;
    }
}