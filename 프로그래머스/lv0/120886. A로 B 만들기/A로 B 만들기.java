import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        if(Arrays.equals(beforeArr, afterArr)) {   // return new String(a).equals(new String(b)) ? 1 :0; 로 변경할 수도 있다.
            answer++;
        }
        return answer;
    }
}
