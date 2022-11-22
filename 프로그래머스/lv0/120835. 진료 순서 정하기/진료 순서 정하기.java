import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0 ; i<= emergency.length-1; i++) {
            for(int j = 0 ; j < i; j++) {
                if(emergency[j] > emergency[i]) {
                    answer[i] ++;
                } else {
                    answer[j] ++;
                }
            }   
            answer[i]++;
        }
        return answer;
    }
}