import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length+1];
        
        for(int i = 0; i<= numbers.length-1; i++) {
            if(direction.equals("right")) {
                answer[i+1] = numbers[i];
                answer[0] = numbers[numbers.length-1];
            }else if(direction.equals("left")){
                answer[i] = numbers[i];
                answer[answer.length-1] = numbers[0];
            }
        }
        return direction.equals("right") ? Arrays.copyOfRange(answer, 0, answer.length-1) : Arrays.copyOfRange(answer, 1, answer.length);
    }
}