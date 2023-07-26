class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // 문제가 이해가 잘안됨.
        // arr에서 k개의 숫자를 최소개수인것들을 제거하고
        // 남은 숫자들의 중복을 제거한 개수를 리턴하라는문제라고 생각하고 풀이실행
        
        //1. 배열의 숫자 key와 개수인 value를 맵에 담는다.
        //2. value값으로 오름차순 정렬
        //2. value가 1인것부터 순차대로 제거한다.
        //3. 카운트만큼 k에서 빼고 k가 마이너스가되면 배열의길이에서 회차만큼 뺀값을 리턴
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        List<Integer> list = new ArrayList<Integer>(map.values());
        
        Collections.sort(list); // 오름차순 정렬 // [1,2], [1,1,2,3]
        
        
        for(int i=0; i<list.size(); i++) {
            k = k - list.get(i);
            if(k < 0) {
                return list.size()-i;
            }
        }
        return 0;
    }
}