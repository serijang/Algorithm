import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int) Math.ceil((double) my_str.length()/n);
        String[] answer = new String[length];
        for(int cnt = 0 ; cnt <= length-1; cnt++) {
            if(cnt == length-1) {
                answer[cnt] = my_str.substring(n*cnt, my_str.length());
            } else {
                answer[cnt] = my_str.substring(n*cnt,n*(cnt+1));
            }
        }
        return answer;
    }
}