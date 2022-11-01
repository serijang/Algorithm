import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        for(int i=0; i<= numbers.length-1; i++) {
            for (int j=0; j < i; j++) {
            if(numbers[i] * numbers[j] > answer) {
                answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}