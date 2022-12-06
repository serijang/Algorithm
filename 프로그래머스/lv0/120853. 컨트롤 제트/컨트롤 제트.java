import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("\\s");
        for(int i=0; i<=str.length-1; i++){
            if(!str[i].equals("Z")) {
                answer += Integer.parseInt(str[i]);
            } else {
                answer -= Integer.parseInt(str[i-1]);
            }
        }
        return answer;
    }
}