class Solution {
    public long solution(String numbers) {
        String[] numberEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i<= numberEng.length-1; i++) {
                numbers = numbers.replace(numberEng[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}