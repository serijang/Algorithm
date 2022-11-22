import java.util.*;

class Solution {
    public String solution(String s) {
        char[] answer = new char[26];
        int cnt = 0;
        String result = "";
        
        for(int i = 0; i <= s.length()-1; i++) {
            answer[s.charAt(i)-97]++;
        }
        for (int j = 0; j <= answer.length-1; j++) {
            if(answer[j] == 1) {
                result += (char) (j + 97);
            }
        }
            
        return result;
    }
}