class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) {
            return true;
        }

        if(flowerbed.length == 1) {
            return (flowerbed[0] == 0 && n == 1) ? true : false;
        }

        for(int i=0; i<flowerbed.length; i++){ 
            // 1. 첫번째일때는 왼쪽이 없으므로 오른쪽만 체크
            if(i == 0 || (i != flowerbed.length-1 && flowerbed[i-1] == 0)) {
                if(flowerbed[i+1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    n -= 1;
                    if(n == 0) {
                        break;
                    }
                }
            }
            // 2. 마지막일때는 왼쪽만 체크
            // 3. 그외에는 i-1 , i+1을 체크
            if(i == flowerbed.length-1 || (i != 0 && flowerbed[i+1] == 0) ) {
                // 4. true면 n -=1하고 해당 i번째에 1삽입
                // 5. n이 0이면 true 0이아니면 false    
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    n -= 1;
                    if(n == 0) {
                        break;
                    }
                }
            }
            
        }
        return n == 0;
    }
}