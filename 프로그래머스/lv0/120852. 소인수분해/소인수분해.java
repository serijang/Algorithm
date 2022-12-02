import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int cnt = 0;
        for(int i=2; i <= n; i++) {
            if(n % i == 0) {
                answer[cnt] = i;
                cnt++;
                while(n % i == 0) {
                    n /= i;
                }
            }
        }
        if(answer[0] == 0) {
           answer[0] = n;
            return Arrays.copyOfRange(answer, 0, 1);
        }
        return Arrays.copyOfRange(answer, 0, cnt);
    }
}