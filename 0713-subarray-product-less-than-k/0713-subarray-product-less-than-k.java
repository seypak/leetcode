class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        ////////////////////////////////////////////
        // Sliding-Window(슬라이딩 윈도우) 알고리즘
        ////////////////////////////////////////////
        /* nums: [ 10, 5, 2, 6 ], k = 100
        
        i = left = 0;
        cur = cur * 10 = 10; 
        result = result + 0 - 0 + 1 = 1;  // subarrays - [ 10 ]
        
        i = 1;
        cur = cur * 5 = 10 * 5 = 50
        result = result + 1 - 0 + 1 = 1(i=0) + 1 - 0 + 1 = 3; // subarrays - [ 10 ], [ 5 ], [ 10, 5 ]
        
        i = 2;
        cur = cur * 2 = 50 * 2 = 100;
        cur > k;
        cur = cur / nums[left] = cur / nums[0] = 100 / 10 = 10;
        left++;
        result = result + 2 - 1 + 1 = 3(i=1) + 2 = 5; // subarrays - [ 10 ], [ 5 ], [ 10, 5 ], [ 2 ], [ 5, 2 ] 
        
        i = 3;
        cur = cur * 6 = 10 * 2 = 20;
        result = result + 3 - 1 + 1 = 5(i=2) + 3 = 8; // subarrays - [ 10 ], [ 5 ], [ 10, 5 ], [ 2 ], [ 5, 2 ], [6], [2 , 6], [5, 2 , 6]*/

        if(k <= 1) {
            return 0;
        }

        int result = 0;
        int left = 0;
        int cur = 1;
        for(int i=0; i<nums.length; i++) {
            cur *= nums[i];
            while(cur >= k) {
                cur /= nums[left];
                left++;
            }
            result += i-left+1;
        }
        return result;
    }
}