class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        // 1. temperatures길이만큼의 배열을 선언한다.
        // 2. 해당 배열의 인덱스값보다 큰 다음 인덱스를 찾는다.
        // 3. 2중for문으로 다 찾기에는 timelimit이 걸려 어떤 인덱스값에 찾았던 다음 인덱스값을 저장해놓는다.
        // 4. map에 값이 있고, 해당 값의 인덱스가 내가 찾고자하는 시작점의 인덱스보다 크다면 그 map을 꺼낸다.
        // 5. 없다면 큰 인덱스값을 찾도록 처리한다.
        int[] result = new int[temperatures.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<temperatures.length; i++) {
            int temperature = temperatures[i];
            int count = 0;
            
            if(map.getOrDefault(temperatures[i], 0) != 0 && map.get(temperatures[i]) > i) {
                int compareIndex = map.get(temperatures[i]);
                result[i] = compareIndex-i;
            } else {
                for(int j=i+1; j<temperatures.length; j++) {
                    count++;
                    if(temperature < temperatures[j]) {
                        map.put(temperature , j);
                        result[i] = count;
                        break;
                    }
                }
            }
        }
        return result;
    }
}