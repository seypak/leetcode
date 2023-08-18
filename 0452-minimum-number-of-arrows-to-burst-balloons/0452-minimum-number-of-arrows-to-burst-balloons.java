class Solution {
    public int findMinArrowShots(int[][] points) {
        int count = 0;
        
        Arrays.sort(points, (a,b) -> a[1]- b[1]);
        
        // for(int[] i : points) {
        //     System.out.println(Arrays.toString(i));    
        // }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<points.length; i++) {
            boolean flag = false;
            int[] indexVal = points[i];
            if(map.getOrDefault(i, 0) != 1) {
                for(int j=i+1; j<points.length; j++) {
                    int[] indexVal2 = points[j];
                    if((indexVal[0] >= indexVal2[0] && indexVal[0] <= indexVal2[1])
                    || (indexVal[1] >= indexVal2[0] && indexVal[1] <= indexVal2[1])) {
                        map.put(i, 1);
                        map.put(j, 1);
                        flag = true;
                    }
                } 
            }
            
            if(flag || map.getOrDefault(i, 0) == 0) { 
                count++;
            }
        }
        
        return count;
    }
}