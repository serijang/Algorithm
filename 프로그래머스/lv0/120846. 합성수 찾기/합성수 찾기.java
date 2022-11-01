class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] temp = new int[n];
        int cnt = 0;
        
        for(int i = 1; i<= n; i++) {
            answer = 0;
            for (int j = 1; j<= i; j++) {
                if( i % j == 0) {
                    answer++;
                }
            }
            if(answer == 2) {
                cnt++;
            }
        }
        return n-cnt-1;  // 1일 때는 체크안돼서 빼줘야 함
    }
}