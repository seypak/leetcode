class Solution {
    public String convertToTitle(int columnNumber) {
        // 1. 예시 정리
        // A  : 26*0 + 1
        // AA : 26*1 + 1
        // BA : 26*2 + 1
        // ZA : 26*26 + 1
        // ZZ : 26*26 + 26
        // AAA : 26*26 + 26 + 1
        
        // 2. int형 -> char형이 65부터 A
        // 65 + 0 -> A
        // 65 + 1 -> B
        // ==> -1로 계산.
        
        // 3. 26단위로 문자열이 변경되므로 나누기

        // 4. 분석결과
        // int <-> char 형의 기준
        // 26단위로 변경
        // 문자열까지 뒤집어주어야 답인데 이 부분이 이해가 잘 안됨.
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber -= 1;
            System.out.println((char)(65 + columnNumber%26));
            sb.append((char)(65 + columnNumber%26));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}