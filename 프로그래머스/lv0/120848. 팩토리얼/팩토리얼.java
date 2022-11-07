class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 0;
        while(answer <= n) {
            i++;
            answer *= i;
        }
        return i-1;
    }
}