class Solution {
    public List<Integer> getRow(int rowIndex) {
        //   1
        //  1,1     -
        // 1,2,1    - 1,0+1,1      => 3일때 0,1
        //1,3,3,1   - 1,0+1,1+2,1  => 4일때 0,1,2
        List<Integer> init = new ArrayList<Integer>();
        init.add(1);
        if(rowIndex == 0) {
            return init;
        }
        List<Integer> init2 = new ArrayList<Integer>();
        init2.add(1);
        init2.add(1);
        if(rowIndex == 1) {
            return init2;
        }
        
        for(int i=2; i<=rowIndex; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            int len = i-1;
            for(int j=0; j<len; j++) {
                temp.add(init2.get(j) + init2.get(j+1));
            }
            temp.add(1);
            init2 = temp;
        }
        return init2;
    }
}