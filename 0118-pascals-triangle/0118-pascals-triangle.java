class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //   1
        //  1,1     -
        // 1,2,1    - 1,0+1,1      => 3일때 0,1
        //1,3,3,1   - 1,0+1,1+2,1  => 4일때 0,1,2
        List<Integer> init = new ArrayList<Integer>();
        init.add(1);
        list.add(init);
        System.out.println("list : " + list);
        if(numRows == 1) {
            return list;
        }
        List<Integer> init2 = new ArrayList<Integer>();
        init2.add(1);
        init2.add(1);
        list.add(init2);
        if(numRows == 2) {
            return list;
        }
        
        for(int i=3; i<=numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            int len = i-1;
            for(int j=0; j<len-1; j++) {
                temp.add(init2.get(j) + init2.get(j+1));
            }
            list.add(temp);
            temp.add(1);
            init2 = temp;
        }
        return list;
    }
}