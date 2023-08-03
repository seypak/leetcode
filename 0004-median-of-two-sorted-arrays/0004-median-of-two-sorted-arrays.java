class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergeList = new ArrayList<Integer>();
        // 1. 두 배열을 합친다.
        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        mergeList.addAll(nums1List);
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        mergeList.addAll(nums2List);
        // 2. 합친 배열을 정렬한다.
        Collections.sort(mergeList);
        
        int len = mergeList.size();
        double result = 0;
        if(len % 2 == 0) {
            // 3. length%2==0 arr[(length/2)-1] + arr[(length/2)] /2
            result = (mergeList.get((len/2)-1) + mergeList.get(len/2)) / 2.0;
        } else {
            // 4. length%2!=0 3: 2, 5:3, 7:4 arr[((length+1)/2)-1]
            result = mergeList.get(((len+1)/2)-1);
        }
        
        return result;
    }
}