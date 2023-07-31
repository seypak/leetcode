class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //List<Integer> listNums1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        //List<Integer> listNums2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        //listNums1.addAll(listNums2);
        //nums1 = listNums1.stream().filter(x -> x !=0).sorted().mapToInt(i -> i).toArray();
        

        if(nums2.length != 0) {
            
            int nums2Index = 0;
            for(int i=m; i<nums1.length; i++) {
                nums1[i] = nums2[nums2Index];
                nums2Index++;
            }

            Arrays.sort(nums1);
        }
    }
}