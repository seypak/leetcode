class Solution {
    public int maxArea(int[] height) {
        
        // left / right index를 잡아 좌표점의 이동에따라 높이를 계산
        
        // (0,1) (8,7) : 1 * 8 = 8 => max : 8
        // (1,8) (8,7) : 7 * 7 = 49 => max : 49
        // (1,8) (7,3) : 3 * 6 = 18 => max : 49
        // (1,8) (6,8) : 8 * 5 = 40 => max : 49
        // (1,8) (5,4) : 4 * 4 = 16 => max : 49
        // (1,8) (4,5) : 5 * 3 = 15 => max : 49
        // (1,8) (3,2) : 2 * 2 = 4  => max : 49
        // (1,8) (2,6) : 6 * 1 = 6  => max : 49

        int left = 0;
        int right = height.length-1;
        int max = 0;

        while(left < right) {
            int indexMax = Math.min(height[left], height[right]) * (right-left);
            System.out.println("indexMax : " + indexMax);
            System.out.println("max : " + max);
            max = Math.max(indexMax, max);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}