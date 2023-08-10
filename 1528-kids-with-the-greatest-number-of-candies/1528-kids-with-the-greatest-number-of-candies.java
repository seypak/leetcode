class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i : candies) {
            if(i > max) {
                max = i;
            }
        }
        
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i : candies) {
            list.add(i+extraCandies >= max);
        }
        return list;
    }
}