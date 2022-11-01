import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String temp = Arrays.toString(array);
        
        for(int i = 0; i<= temp.length()-1; i++) {
            if(temp.charAt(i) == '7') {
                answer++;
            }
        }
        return answer;
    }
}