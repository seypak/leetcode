import java.util.stream.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        List<Integer> tmpNums1List = new ArrayList<Integer>();
        List<Integer> tmpNums2List = new ArrayList<Integer>();
        for(int i=0; i<nums1List.size(); i++) {
            int nums1Val = nums1List.get(i);
            if(!nums2List.contains(nums1Val) && !tmpNums1List.contains(nums1Val)) {
                tmpNums1List.add(nums1Val);
            }
        }
        for(int i=0; i<nums2List.size(); i++) {
            int nums2Val = nums2List.get(i);
            if(!nums1List.contains(nums2Val) && !tmpNums2List.contains(nums2Val)) {
                tmpNums2List.add(nums2Val);
            }
        }
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(tmpNums1List);
        list.add(tmpNums2List);
        return list;
    }
}