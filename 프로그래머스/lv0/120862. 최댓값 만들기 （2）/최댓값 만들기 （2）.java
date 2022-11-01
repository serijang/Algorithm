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

// 다른 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);  // 정렬
        return numbers[numbers.length-1] * numbers[numbers.length-2] < numbers[0] * numbers[1] ? 
            numbers[0] * numbers[1] : numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
// 음수중에 절대값이 가장 큰 수 두개의 곱과 양수 중 가장 큰 2개의 수 곱을 비교
