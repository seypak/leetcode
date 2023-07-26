class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        
        for(int i=1; i<=n; i++) {
            // 1. divisible 3/5 == 0 "FizzBuzz"
            // 2. divisible 3 == 0 "Fizz"
            // 3. divisible 5 == 0 "Buzz"
            if(i%3 == 0 && i%5 == 0) {
                list.add("FizzBuzz");
            } else if(i%3 == 0) {
                list.add("Fizz");
            } else if(i%5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}