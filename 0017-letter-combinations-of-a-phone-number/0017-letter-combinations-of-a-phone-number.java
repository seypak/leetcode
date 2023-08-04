class Solution {
    public List<String> letterCombinations(String digits) {
        
        // 1. 숫자별 문자열 map을 만든다.
        // 2. digits의 숫자문자열 별 2중 for문을 만들어 리스트를 만든다.
        Map<Character, List<String>> map = new HashMap<Character, List<String>>();
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));

        List<String> list = new ArrayList<String>();
        if(digits.length() == 0) {
            return list;
        }

        int len = digits.length();
        // 1, list 1개
        // 2, list 2개
        // 3, list 3개
        // 4, list 4개
        if(len == 1) {
            List<String> list1 = map.get(digits.charAt(0));
            for(int i=0; i<list1.size(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(list1.get(i));
                list.add(sb.toString());
            }
        } else if(len == 2) {
            List<String> list1 = map.get(digits.charAt(0));
            List<String> list2 = map.get(digits.charAt(1));
            for(int i=0; i<list1.size(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(list1.get(i));
                for(int j=0; j<list2.size(); j++) {
                    sb.append(list2.get(j));
                    list.add(sb.toString());
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        } else if(len == 3) {
            List<String> list1 = map.get(digits.charAt(0));
            List<String> list2 = map.get(digits.charAt(1));
            List<String> list3 = map.get(digits.charAt(2));
            for(int i=0; i<list1.size(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(list1.get(i));
                for(int j=0; j<list2.size(); j++) {
                    sb.append(list2.get(j));
                    for(int k=0; k<list3.size(); k++) {
                        sb.append(list3.get(k));
                        list.add(sb.toString());
                        sb.deleteCharAt(sb.length()-1);
                    }
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        } else if(len == 4) {
            List<String> list1 = map.get(digits.charAt(0));
            List<String> list2 = map.get(digits.charAt(1));
            List<String> list3 = map.get(digits.charAt(2));
            List<String> list4 = map.get(digits.charAt(3));
            for(int i=0; i<list1.size(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(list1.get(i));
                for(int j=0; j<list2.size(); j++) {
                    sb.append(list2.get(j));
                    for(int k=0; k<list3.size(); k++) {
                        sb.append(list3.get(k));
                        for(int l=0; l<list4.size(); l++) {
                            sb.append(list4.get(l));
                            list.add(sb.toString());
                            sb.deleteCharAt(sb.length()-1);
                        }
                        sb.deleteCharAt(sb.length()-1);
                    }
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return list;
    }
}