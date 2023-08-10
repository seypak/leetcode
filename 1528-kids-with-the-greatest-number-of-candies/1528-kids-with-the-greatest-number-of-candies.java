class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 1. 캔디들 중 가장 큰 것을 추출한다.
        int max = 0;
        for(int i : candies) {
            if(i > max) {
                max = i;
            }
        }
        
        List<Boolean> list = new ArrayList<Boolean>();
        // 2. 캔디들 + 여분의캔디 >= 가장큰것 이면 true를 담아 리턴한다.
        for(int i : candies) {
            list.add(i+extraCandies >= max);
        }
        return list;
    }
}