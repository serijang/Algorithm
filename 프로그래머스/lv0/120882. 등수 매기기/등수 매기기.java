import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);

        for(int i=0; i<= score.length-1; i++) {
            for(int j=0; j<= score.length-1; j++) {
                if(score[i][0] + score[i][1] > score[j][0] + score[j][1]) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}